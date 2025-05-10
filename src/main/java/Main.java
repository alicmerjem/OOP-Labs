import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("Buddy", 5);
            Class<?> dogClass = dog.getClass();

            // Print full class name
            System.out.println("Class name: " + dogClass.getName());

            // List and display all fields
            System.out.println("\nFields:");
            for (Field field : dogClass.getDeclaredFields()) {
                field.setAccessible(true);
                int modifiers = field.getModifiers();
                System.out.println("Name: " + field.getName() +
                                   ", Type: " + field.getType().getSimpleName() +
                                   ", Access: " + Modifier.toString(modifiers));
            }

            // List and display all methods
            System.out.println("\nMethods:");
            for (Method method : dogClass.getDeclaredMethods()) {
                int modifiers = method.getModifiers();
                String params = "";
                for (Class<?> paramType : method.getParameterTypes()) {
                    params += paramType.getSimpleName() + " ";
                }
                System.out.println("Name: " + method.getName() +
                                   ", Return Type: " + method.getReturnType().getSimpleName() +
                                   ", Parameters: [" + params.trim() + "]" +
                                   ", Access: " + Modifier.toString(modifiers));
            }

            // Modify private final field 'name'
            Field nameField = dogClass.getDeclaredField("name");
            nameField.setAccessible(true);

            // Remove final modifier
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(nameField, nameField.getModifiers() & ~Modifier.FINAL);

            nameField.set(dog, "Max");
            System.out.println("\nModified name field to: " + nameField.get(dog));

            // Modify value of 'age'
            Field ageField = dogClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(dog, 10);
            System.out.println("Modified age field to: " + ageField.get(dog));

            // Invoke public method with no args: bark()
            Method barkMethod = dogClass.getDeclaredMethod("bark");
            barkMethod.invoke(dog);

            // Invoke public method with a parameter: say(String)
            Method sayMethod = dogClass.getDeclaredMethod("say", String.class);
            sayMethod.invoke(dog, "I love bones!");

            // Invoke private method: whisper()
            Method whisperMethod = dogClass.getDeclaredMethod("whisper");
            whisperMethod.setAccessible(true);
            whisperMethod.invoke(dog);

            // Invoke static method: info()
            Method infoMethod = dogClass.getDeclaredMethod("info");
            infoMethod.invoke(null); // null for static methods

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
