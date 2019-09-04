
package funciones;


public class clsEstadistica {
    private int[] arreglo;
    public clsEstadistica(int [] arreglolleno){
    arreglo = arreglolleno;
    }
    public double promedio(){
    double prom = 0.0;
    for(int i=0;i<arreglo.length;i++){
    prom+=arreglo[i];
    }
    return prom/(double) arreglo.length;
    }
  public static void orden2(int ord){
  int [] vec={4,5,8,1,0,9,3,2,8};
  int i,j,n= vec.length, aux = 0;
  for (i=0;i<n-1;i++){
      for(j=i+1;j<n;j++){
      if (ord==0){
        if(vec[i]>vec[j]){
      aux = vec [j];
      vec[j]=vec[i];
      vec[i]=aux;              }
        }
      else if(ord == 1){
           if(vec[i]<vec[j]){
      aux = vec [i];
      vec[i]=vec[j];
      vec[j]=aux; 
              }
         }
      }
  }
    
  }
  public  void burbuja(int ord){
  int [] vec= arreglo;
  
  int i,j,n= vec.length, aux = 0;
  for (i=0;i<n-1;i++){
      for(j=i+1;j<n;j++){
      if (ord==0){
        if(vec[i]>vec[j]){
      aux = vec [j];
      vec[j]=vec[i];
      vec[i]=aux;              }
        }
      else if(ord == 1){
           if(vec[i]<vec[j]){
      aux = vec [i];
      vec[i]=vec[j];
      vec[j]=aux; 
              }
         }
      }
  }
  arreglo = vec;
  }
  public static void despliega(int[] arr){
  for(int i=0;i<arr.length;i++){
  System.out.print(arr[i]+"");
  }
  System.out.println("");
  }
  
  public double mediana(){
  int pos= 0, n=arreglo.length;
  double temp = 0, temp0 = 0;
   burbuja(0);
   
   temp = n/2;
   if(n%2 == 0){
   pos= (int)(temp);
   temp0 = (double)(arreglo [pos]/arreglo[pos+1]);
   }
   if (n%2==1){
       pos = (int)(temp+0.5);
       temp0 = (double)(arreglo[pos]);
           }
   return temp0;
  }
  public double desviacion (){
  double prom, sum = 0; int i, n = arreglo.length;
  prom = promedio();
  for(i =0; i<n;i++){
  
  sum += Math.pow (arreglo[i]-prom,2);
  
  }
  return Math.sqrt(sum/(double)n);
  }
  
  public int rango(){
  
  burbuja(0);
  return arreglo[arreglo.length-1]-arreglo[0];
  }
  
  public int moda(){
  int i,j,moda=0, n=arreglo.length,frec;
  
  int frecTemp, frecmoda=0, moda1 = -1;
  burbuja(0);
  for (i=0;i<n;i++){
  frecTemp = 1;
  for (j=i+1;j<n;j++){
  if (arreglo[i]==arreglo[j]){
  frecTemp++;
  }
  if (frecTemp>frecmoda){
  frecmoda = frecTemp;
  moda1 = arreglo[i];
  }
  }
  }
  return moda1;
  }
  
  public void reportavector(){
  for(int i =0; i <arreglo.length;i++){
    System.out.print(arreglo[i]+" ");
    System.out.println("");
    }
  }
  
}
