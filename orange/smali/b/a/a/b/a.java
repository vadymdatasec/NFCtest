public class b.a.a.b.a implements b.a.a.b.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static b.a.a.b.c b;
	 /* # instance fields */
	 public android.os.IBinder a;
	 /* # direct methods */
	 public b.a.a.b.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.os.IBinder asBinder ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public void b ( Integer p0, android.os.Bundle p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 android.os.Parcel .obtain ( );
	 try { // :try_start_0
		 final String v1 = "android.support.v4.os.IResultReceiver"; // const-string v1, "android.support.v4.os.IResultReceiver"
		 /* .line 2 */
		 (( android.os.Parcel ) v0 ).writeInterfaceToken ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
		 /* .line 3 */
		 (( android.os.Parcel ) v0 ).writeInt ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 4 */
			 (( android.os.Parcel ) v0 ).writeInt ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V
			 /* .line 5 */
			 (( android.os.Bundle ) p2 ).writeToParcel ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
			 /* .line 6 */
		 } // :cond_0
		 (( android.os.Parcel ) v0 ).writeInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
		 /* .line 7 */
	 } // :goto_0
	 v1 = this.a;
	 v1 = 	 int v3 = 0; // const/4 v3, 0x0
	 /* if-nez v1, :cond_1 */
	 /* .line 8 */
	 b.a.a.b.b .e ( );
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 9 */
		 b.a.a.b.b .e ( );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 10 */
		 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
		 return;
	 } // :cond_1
	 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
	 /* .line 11 */
	 /* throw p1 */
} // .end method
