package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;


    private static final int NO_RESOURCE_PROVIDED = -1;

    /**
     * @param defaultTranslation is the word in the user's language
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

        mImageResourceId = NO_RESOURCE_PROVIDED;
    }

    /**
     * @param defaultTranslation is the word in the user's language
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the ID of the image resource
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
        mImageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_RESOURCE_PROVIDED;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the associated image resource Id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the associated audio resource ID
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
