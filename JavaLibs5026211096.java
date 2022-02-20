import javax.swing.*;
public class JavaLibs5026211096 {
	public static void main (String args[]) {
		
		//1-Nama
		String nama = (String)JOptionPane.showInputDialog(null,"Isi nama kamu ya!","Nama",2,null,null,"hayo siapa");
		JOptionPane.showMessageDialog(null, "Salam Kenal!");
		
		//2-Umur
		String umurString = JOptionPane.showInputDialog("Umur kamu berapa?");
		int umur = Integer.parseInt(umurString);
		
		//3-UmurAyah
		String umurAyahString = JOptionPane.showInputDialog("Kalau umur Ayah kamu berapa?");
		int umurAyah = Integer.parseInt(umurAyahString);
		
		//4-UmurIbu
		String umurIbuString = JOptionPane.showInputDialog("Kalau umur Ibu kamu?");
		int umurIbu = Integer.parseInt(umurIbuString);
		JOptionPane.showMessageDialog(null, "Nah, sekarang coba dijumlah umur kamu, Ayah, dan Ibu!");
		
		//5-JumlahUmur
		int jumlah = umur+umurIbu+umurAyah;
		String[] jumlahnya = {"Benar", "Salah"};
		String hasile = (String)JOptionPane.showInputDialog(null,"apakah hasilnya "+ jumlah+ "?","Hasil jumlah",2,null,jumlahnya,jumlahnya[1]);
		JOptionPane.showMessageDialog(null, "Jago matematika juga kan aku hoho");
		
		//6-RataUmur
		JOptionPane.showMessageDialog(null, "Sekarang umurnya dirata-rata, yuk!");
		double rata = ((umur+umurIbu+umurAyah)/3);
		String[] rata2 = {"Ya", "Tidak"};
		String ratarata = (String)JOptionPane.showInputDialog(null,"apakah hasilnya "+ rata+ "?","Hasil rata-rata",2,null,rata2,rata2[1]);
		JOptionPane.showMessageDialog(null, "Keren kan aku");
		
		//7-HargaBaju
		String hargaBString = JOptionPane.showInputDialog("Berapa harga baju kamu yang paling murah?");
		double hargaB = Double.parseDouble(hargaBString);
		JOptionPane.showMessageDialog(null, "Wih, orang kaya, nih!");
		
		//8-BeliBerapa
		String berapaString = JOptionPane.showInputDialog("Kamu biasanya dalam sebulan beli baju berapa, nih?");
		int berapa = Integer.parseInt(berapaString);
		JOptionPane.showMessageDialog(null, "Wih, crazyrich, nih!");
		
		//9-Kali
		JOptionPane.showMessageDialog(null, "Nah, sekarang coba deh kamu kaliin harga dan jumlah baju tadi.");
		double harga = hargaB*berapa;
		String[] kali = {"Betul", "Betul Sekali"};
		String hasilkali = (String)JOptionPane.showInputDialog(null,"aku ramal sih hasilnya "+ harga+ "?","Hasil kali",2,null,kali,kali[1]);
		JOptionPane.showMessageDialog(null, "Dibilangin, aku tuh jago matematika!");

		//10-ThankYou
		String[] seru = {"seru", "seru bgt lah"};
		String asik = (String)JOptionPane.showInputDialog(null,"Gimana seru ngga hitung-hitungannya?","Seru nggak woy",3,null,seru,seru[1]);
		JOptionPane.showMessageDialog(null, "Okedeh, makasih ya udah main sama aku, sampai jumpa lagi!");
	}
}