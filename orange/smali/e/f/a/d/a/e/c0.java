public abstract class e.f.a.d.a.e.c0 implements android.os.IInterface {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.os.IBinder a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public e.f.a.d.a.e.c0 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0, android.os.Parcel p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 try { // :try_start_0
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 (( android.os.Parcel ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 (( android.os.Parcel ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V
		 /* throw p1 */
	 } // .end method
	 public final android.os.IBinder asBinder ( ) {
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 public final android.os.Parcel e ( ) {
		 /* .locals 2 */
		 android.os.Parcel .obtain ( );
		 v1 = this.b;
		 (( android.os.Parcel ) v0 ).writeInterfaceToken ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
	 } // .end method
