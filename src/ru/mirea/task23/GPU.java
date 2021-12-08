package ru.mirea.task23;

public class GPU {
    private String manufacturer;
    private int year;
    private int frequency;      //MHz
    private int videoMemoryVolume;      //MB
    private int busWidth;       //-bit

    public GPU (String manufacturer, int year, int frequency, int videoMemoryVolume, int busWidth)
    {
        this.manufacturer = manufacturer;
        this.year = year;
        this.frequency = frequency;
        this.videoMemoryVolume = videoMemoryVolume;
        this.busWidth = busWidth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        GPU gpu = (GPU) obj;

        if (year != gpu.year)
        {
            return false;
        }
        if (frequency != gpu.frequency)
        {
            return false;
        }
        if (videoMemoryVolume != gpu.videoMemoryVolume)
        {
            return false;
        }
        if (busWidth != gpu.busWidth)
        {
            return false;
        }
        return manufacturer.equals(gpu.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = manufacturer == null ? 0 : manufacturer.hashCode();
        result = 29 * result + year;
        result = 29 * result + frequency;
        result = 29 * result + videoMemoryVolume;
        result = 29 * result + busWidth;
        return result;
    }

    public int getBusWidth() {
        return busWidth;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getVideoMemoryVolume() {
        return videoMemoryVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setBusWidth(int busWidth) {
        this.busWidth = busWidth;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVideoMemoryVolume(int videoMemoryVolume) {
        this.videoMemoryVolume = videoMemoryVolume;
    }
}
