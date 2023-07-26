public abstract class e.f.a.d.a.e.p0 extends e.f.a.d.a.e.d0 implements e.f.a.d.a.e.q0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.d.a.e.p0 ( ) {
		 /* .locals 1 */
		 final String v0 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService"; // const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService"
		 /* invoke-direct {p0, v0}, Le/f/a/d/a/e/d0;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean a ( Integer p0, android.os.Parcel p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 int v0 = 2; // const/4 v0, 0x2
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"; // const-string v2, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
	 /* if-eq p1, v0, :cond_3 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* if-eq p1, v0, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
} // :cond_0
p1 = android.os.Bundle.CREATOR;
e.f.a.d.a.e.e0 .a ( p2,p1 );
/* check-cast p1, Landroid/os/Bundle; */
(( android.os.Parcel ) p2 ).readStrongBinder ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
/* if-nez p1, :cond_1 */
} // :cond_1
/* instance-of v0, p2, Le/f/a/d/a/e/s0; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move-object v1, p2 */
/* check-cast v1, Le/f/a/d/a/e/s0; */
} // :cond_2
/* new-instance v1, Le/f/a/d/a/e/r0; */
/* invoke-direct {v1, p1}, Le/f/a/d/a/e/r0;-><init>(Landroid/os/IBinder;)V */
} // :goto_0
} // :cond_3
p1 = android.os.Bundle.CREATOR;
e.f.a.d.a.e.e0 .a ( p2,p1 );
/* check-cast p1, Landroid/os/Bundle; */
(( android.os.Parcel ) p2 ).readStrongBinder ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
/* if-nez p2, :cond_4 */
} // :cond_4
/* instance-of v1, v0, Le/f/a/d/a/e/s0; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* move-object v1, v0 */
/* check-cast v1, Le/f/a/d/a/e/s0; */
} // :cond_5
/* new-instance v1, Le/f/a/d/a/e/r0; */
/* invoke-direct {v1, p2}, Le/f/a/d/a/e/r0;-><init>(Landroid/os/IBinder;)V */
} // :goto_1
} // :goto_2
int p1 = 1; // const/4 p1, 0x1
} // .end method
