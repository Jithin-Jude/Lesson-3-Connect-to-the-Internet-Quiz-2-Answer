public static URL buildUrl() {
    Uri builtUri = Uri.parse("https://developer.android.com/guide/components/intents-common." +
            "html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics#Phone")
            .buildUpon().build();

    URL url = null;
    try {
        url = new URL(builtUri.toString());
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }

    return url;
}