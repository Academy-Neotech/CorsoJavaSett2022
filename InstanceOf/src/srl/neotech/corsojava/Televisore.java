package srl.neotech.corsojava;

public class Televisore {
	
	private int volumeAudio;

	
	
	public int getVolumeAudio() {
		return  volumeAudio;
	}

	public void setVolumeAudio(int volumeAudio) throws Exception {
		if(volumeAudio>20) throw new Exception("Il volume non puo essere pou alto di 20");
		this.volumeAudio = volumeAudio;
	}
	
	

}
