public abstract class e.f.a.b.c.m.n extends e.f.a.b.e.c.a implements e.f.a.b.c.m.m {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.b.c.m.n ( ) {
		 /* .locals 1 */
		 final String v0 = "com.google.android.gms.common.internal.ICertData"; // const-string v0, "com.google.android.gms.common.internal.ICertData"
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Le/f/a/b/e/c/a;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean a ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 int p2 = 1; // const/4 p2, 0x1
	 /* if-eq p1, p2, :cond_1 */
	 int p4 = 2; // const/4 p4, 0x2
	 /* if-eq p1, p4, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 1 */
p1 = } // :cond_0
/* .line 2 */
(( android.os.Parcel ) p3 ).writeNoException ( ); // invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
/* .line 3 */
(( android.os.Parcel ) p3 ).writeInt ( p1 ); // invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
} // :cond_1
/* .line 5 */
(( android.os.Parcel ) p3 ).writeNoException ( ); // invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
/* .line 6 */
e.f.a.b.e.c.b .a ( p3,p1 );
} // :goto_0
} // .end method
