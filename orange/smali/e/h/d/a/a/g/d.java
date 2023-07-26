public class e.h.d.a.a.g.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.h.d.a.a.g.z.c a;
	 /* # direct methods */
	 public e.h.d.a.a.g.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static e.h.d.a.a.g.d a ( Object[] p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/h/d/a/a/g/d; */
		 e.h.d.a.a.g.z.c .a ( p0 );
		 /* invoke-direct {v0, p0}, Le/h/d/a/a/g/d;-><init>(Le/h/d/a/a/g/z/c;)V */
	 } // .end method
	 /* # virtual methods */
	 public fr.mbs.binary.Octets a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 try { // :try_start_0
			 (( e.h.d.a.a.g.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/d;->b(I)Lfr/mbs/binary/Octets;
			 /* .line 3 */
			 v0 = 			 (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
			 int v1 = 6; // const/4 v1, 0x6
			 /* if-ne v0, v1, :cond_0 */
			 fr.mbs.binary.Octets .empty ( );
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 4; // const/4 v1, 0x4
		 (( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 /* .line 4 */
	 /* :catch_0 */
	 /* new-instance p1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v0 = "Error while getting manufacturer specific data "; // const-string v0, "Error while getting manufacturer specific data "
	 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v0 = this.a;
	 (( e.h.d.a.a.g.z.c ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/z/c;->a()Landroid/util/SparseArray;
	 e.h.d.a.a.g.z.a .a ( v0 );
	 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v0 = "packid.ble.AdvertisData"; // const-string v0, "packid.ble.AdvertisData"
	 android.util.Log .e ( v0,p1 );
	 /* .line 5 */
	 fr.mbs.binary.Octets .empty ( );
} // .end method
public fr.mbs.binary.Octets b ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
	 (( e.h.d.a.a.g.z.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/g/z/c;->a(I)[B
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 2 */
		 fr.mbs.binary.Octets .createOctets ( p1 );
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "manufacturerId not found in scan record"; // const-string v0, "manufacturerId not found in scan record"
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public fr.mbs.binary.Octets c ( Integer p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 try { // :try_start_0
		 (( e.h.d.a.a.g.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/d;->b(I)Lfr/mbs/binary/Octets;
		 /* .line 2 */
		 v0 = 		 (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
		 int v1 = 6; // const/4 v1, 0x6
		 /* if-ne v0, v1, :cond_0 */
	 } // :cond_0
	 int v0 = 4; // const/4 v0, 0x4
	 (( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* .line 3 */
/* :catch_0 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Error while getting zoneid from manufacturer specific data "; // const-string v0, "Error while getting zoneid from manufacturer specific data "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.a;
(( e.h.d.a.a.g.z.c ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/z/c;->a()Landroid/util/SparseArray;
e.h.d.a.a.g.z.a .a ( v0 );
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.ble.AdvertisData"; // const-string v0, "packid.ble.AdvertisData"
android.util.Log .e ( v0,p1 );
/* .line 4 */
fr.mbs.binary.Octets .empty ( );
} // .end method
