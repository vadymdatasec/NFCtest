public class e.h.d.a.a.s.x extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/o<", */
	 /* "Le/h/d/a/a/s/z;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.x ( ) {
	 /* .locals 6 */
	 final String v1 = "badge"; // const-string v1, "badge"
	 final String v2 = "description"; // const-string v2, "description"
	 final String v3 = ""; // const-string v3, ""
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* .line 1 */
	 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public e.h.d.a.a.s.z a ( android.database.Cursor p0 ) {
	 /* .locals 2 */
	 final String v0 = "badgeId"; // const-string v0, "badgeId"
	 /* .line 2 */
	 v0 = 	 e.h.d.a.a.m .a ( v0,p1 );
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 final String v1 = "zoneId"; // const-string v1, "zoneId"
	 /* .line 3 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 fr.mbs.binary.Octets .createOctets ( p1 );
	 /* .line 4 */
	 /* new-instance v1, Le/h/d/a/a/s/z; */
	 /* invoke-direct {v1, p1, v0}, Le/h/d/a/a/s/z;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( e.h.d.a.a.s.x ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/x;->a(Landroid/database/Cursor;)Le/h/d/a/a/s/z;
} // .end method
