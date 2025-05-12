public class Messages {
    private String language;

    public Messages(String language) {
        this.language = language;
    }

    public String getAccountUpdatedMessage() {
        switch (language) {
            case "ar":
                return "✅ تم تحديث الحساب بنجاح.";
            case "en":
                return "✅ Account updated successfully.";
            case "he":
                return "✅ החשבון עודכן בהצלחה.";
            default:
                return "✅ Account updated.";
        }
    }

    public String getAccountCreatedMessage() {
        switch (language) {
            case "ar":
                return "✅ تم إنشاء حساب جديد.";
            case "en":
                return "✅ New account created.";
            case "he":
                return "✅ נוצר חשבון חדש.";
            default:
                return "✅ New account created.";
        }
    }
}
