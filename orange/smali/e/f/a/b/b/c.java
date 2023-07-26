public class e.f.a.b.b.c implements e.f.a.b.b.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.os.IBinder a;
	 /* # direct methods */
	 public e.f.a.b.b.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.os.Message p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 android.os.Parcel .obtain ( );
	 final String v1 = "com.google.android.gms.iid.IMessengerCompat"; // const-string v1, "com.google.android.gms.iid.IMessengerCompat"
	 /* .line 2 */
	 (( android.os.Parcel ) v0 ).writeInterfaceToken ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 3 */
	 (( android.os.Parcel ) v0 ).writeInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 4 */
	 (( android.os.Message ) p1 ).writeToParcel ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/os/Message;->writeToParcel(Landroid/os/Parcel;I)V
	 /* .line 5 */
	 try { // :try_start_0
		 p1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 6 */
		 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* .line 7 */
		 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
		 /* .line 8 */
		 /* throw p1 */
	 } // .end method
	 public android.os.IBinder asBinder ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
