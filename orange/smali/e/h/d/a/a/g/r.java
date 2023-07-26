public class e.h.d.a.a.g.r {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.h.d.a.a.g.r a;
	 public static java.util.HashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap<", */
	 /* "Lfr/mbs/binary/Octets;", */
	 /* "Le/h/d/a/a/g/x;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.h.d.a.a.g.r ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public e.h.d.a.a.g.r ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static e.h.d.a.a.g.r a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.g.r.a;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/h/d/a/a/g/r; */
/* invoke-direct {v0}, Le/h/d/a/a/g/r;-><init>()V */
/* .line 3 */
} // :cond_0
v0 = e.h.d.a.a.g.r.a;
} // .end method
public static void a ( fr.mbs.binary.Octets p0, Object p1 ) {
/* .locals 1 */
/* .line 18 */
v0 = e.h.d.a.a.g.r.b;
v0 = (( java.util.HashMap ) v0 ).containsKey ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 19 */
v0 = e.h.d.a.a.g.r.b;
(( java.util.HashMap ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 20 */
} // :cond_0
v0 = e.h.d.a.a.g.r.b;
(( java.util.HashMap ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public static Boolean a ( android.bluetooth.BluetoothDevice p0, fr.mbs.binary.Octets p1, Integer p2 ) {
/* .locals 6 */
/* .line 4 */
/* new-instance v0, Le/h/d/a/a/g/x; */
/* invoke-direct {v0, p0, p1, p2}, Le/h/d/a/a/g/x;-><init>(Landroid/bluetooth/BluetoothDevice;Lfr/mbs/binary/Octets;I)V */
/* .line 5 */
p0 = e.h.d.a.a.g.r.b;
p0 = (( java.util.HashMap ) p0 ).containsKey ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
int p2 = 1; // const/4 p2, 0x1
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 6 */
p0 = e.h.d.a.a.g.r.b;
(( java.util.HashMap ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Le/h/d/a/a/g/x; */
/* .line 7 */
(( e.h.d.a.a.g.x ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->b()Ljava/util/Date;
v1 = (( e.h.d.a.a.g.x ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/g/x;->a(Ljava/util/Date;)Z
int v2 = 2; // const/4 v2, 0x2
final String v3 = "KnownReadersManager"; // const-string v3, "KnownReadersManager"
int v4 = 0; // const/4 v4, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 8 */
	 e.h.d.a.a.g.r .a ( p1,v0 );
	 /* new-array p1, v2, [Ljava/lang/Object; */
	 /* .line 9 */
	 (( e.h.d.a.a.g.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
	 /* aput-object p0, p1, v4 */
	 (( e.h.d.a.a.g.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
	 /* aput-object p0, p1, p2 */
	 final String p0 = "knownReader : %s newReader : %s Date Expired"; // const-string p0, "knownReader : %s newReader : %s Date Expired"
	 java.lang.String .format ( p0,p1 );
	 android.util.Log .d ( v3,p0 );
	 /* .line 10 */
} // :cond_0
(( e.h.d.a.a.g.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
(( e.h.d.a.a.g.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).equals ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 11 */
	 e.h.d.a.a.g.r .a ( p1,v0 );
	 /* new-array p1, v2, [Ljava/lang/Object; */
	 /* .line 12 */
	 (( e.h.d.a.a.g.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
	 /* aput-object p0, p1, v4 */
	 (( e.h.d.a.a.g.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
	 /* aput-object p0, p1, p2 */
	 final String p0 = "knownReader : %s newReader : %s Same Reader"; // const-string p0, "knownReader : %s newReader : %s Same Reader"
	 java.lang.String .format ( p0,p1 );
	 android.util.Log .d ( v3,p0 );
	 /* .line 13 */
} // :cond_1
v1 = (( e.h.d.a.a.g.x ) v0 ).c ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->c()I
v5 = (( e.h.d.a.a.g.x ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/x;->c()I
/* if-le v1, v5, :cond_2 */
/* .line 14 */
e.h.d.a.a.g.r .a ( p1,v0 );
/* new-array p1, v2, [Ljava/lang/Object; */
/* .line 15 */
(( e.h.d.a.a.g.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
/* aput-object p0, p1, v4 */
(( e.h.d.a.a.g.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
/* aput-object p0, p1, p2 */
final String p0 = "knownReader : %s newReader : %s New Reader better signal"; // const-string p0, "knownReader : %s newReader : %s New Reader better signal"
java.lang.String .format ( p0,p1 );
android.util.Log .d ( v3,p0 );
} // :cond_2
/* new-array p0, p2, [Ljava/lang/Object; */
/* .line 16 */
(( e.h.d.a.a.g.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;
/* aput-object p1, p0, v4 */
final String p1 = "ignoring advertising from %s"; // const-string p1, "ignoring advertising from %s"
java.lang.String .format ( p1,p0 );
android.util.Log .d ( v3,p0 );
/* .line 17 */
} // :cond_3
e.h.d.a.a.g.r .a ( p1,v0 );
} // .end method
