package train.common.library.sounds;

public class SoundRecord
{
    private String horn;
    private float hornVolume;
    private String run;
    private String idle;
    private float runVolume;
    private float idleVolume;
    private int runSoundLength;
    private int idleSoundLength;
    private boolean soundChangeWithSpeed;
    private String bell;
    private int bellLength;

    private String[] horns;

    public String[] getHorns()
    {
        return horns;
    }

    public String getHornString() {
        return horn;
    }

    public String getRunString() {
        return run;
    }

    public String getIdleString() {
        return idle;
    }

    public Float getHornVolume() {
        return hornVolume;
    }

    public Float getRunVolume() {
        return runVolume;
    }

    public Float getIdleVolume() {
        return idleVolume;
    }

    public int getRunSoundLength() {
        return runSoundLength;
    }

    public int getIdleSoundLength() {
        return idleSoundLength;
    }

    public boolean getSoundChangeWithSpeed() {
        return soundChangeWithSpeed;
    }

    public String getBellString() {
        return bell;
    }

    public int getBellLength() {
        return bellLength;
    }

    public SoundRecord(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLength, String idle, float idleVolume, int idleSoundLength, boolean soundChangeWithSpeed, String bell, int bellLength) {
        this.horn = horn;
        this.hornVolume = hornVolume;
        this.run = run;
        this.idle = idle;
        this.runVolume = runVolume;
        this.idleVolume = idleVolume;
        this.runSoundLength = runSoundLength;
        this.idleSoundLength = idleSoundLength;
        this.soundChangeWithSpeed = soundChangeWithSpeed;
        this.bell = bell;
        this.bellLength = bellLength;
    }

    public SoundRecord(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLength, String idle, float idleVolume, int idleSoundLength, boolean soundChangeWithSpeed, String bell, int bellLength, String[] horns) {
        this.horn = horn;
        this.hornVolume = hornVolume;
        this.run = run;
        this.idle = idle;
        this.runVolume = runVolume;
        this.idleVolume = idleVolume;
        this.runSoundLength = runSoundLength;
        this.idleSoundLength = idleSoundLength;
        this.soundChangeWithSpeed = soundChangeWithSpeed;
        this.bell = bell;
        this.bellLength = bellLength;
        this.horns = horns;
    }
}
