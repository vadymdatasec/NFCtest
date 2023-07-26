public abstract class num extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/h/d/a/a/o/a/j;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.h.d.a.a.o.a.j c;
public static final e.h.d.a.a.o.a.j d;
public static final e.h.d.a.a.o.a.j e;
public static final e.h.d.a.a.o.a.j f;
public static final e.h.d.a.a.o.a.j g;
public static final e.h.d.a.a.o.a.j h; //synthetic
/* # instance fields */
public final fr.mbs.binary.Octets b;
/* # direct methods */
public static num ( ) {
	 /* .locals 9 */
	 /* .line 1 */
	 /* new-instance v0, Le/h/d/a/a/o/a/d; */
	 final String v1 = "80B08000"; // const-string v1, "80B08000"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "READ_BADGE"; // const-string v3, "READ_BADGE"
	 /* invoke-direct {v0, v3, v2, v1}, Le/h/d/a/a/o/a/d;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 /* .line 2 */
	 /* new-instance v0, Le/h/d/a/a/o/a/e; */
	 final String v1 = "00A40400"; // const-string v1, "00A40400"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v3 = 1; // const/4 v3, 0x1
	 final String v4 = "SELECT"; // const-string v4, "SELECT"
	 /* invoke-direct {v0, v4, v3, v1}, Le/h/d/a/a/o/a/e;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 /* .line 3 */
	 /* new-instance v0, Le/h/d/a/a/o/a/f; */
	 final String v1 = "80B09000"; // const-string v1, "80B09000"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v4 = 2; // const/4 v4, 0x2
	 final String v5 = "READ_TOKEN"; // const-string v5, "READ_TOKEN"
	 /* invoke-direct {v0, v5, v4, v1}, Le/h/d/a/a/o/a/f;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 /* .line 4 */
	 /* new-instance v0, Le/h/d/a/a/o/a/g; */
	 final String v1 = "80D69000"; // const-string v1, "80D69000"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v5 = 3; // const/4 v5, 0x3
	 final String v6 = "WRITE_TOKEN"; // const-string v6, "WRITE_TOKEN"
	 /* invoke-direct {v0, v6, v5, v1}, Le/h/d/a/a/o/a/g;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 /* .line 5 */
	 /* new-instance v0, Le/h/d/a/a/o/a/h; */
	 final String v1 = "80D69100"; // const-string v1, "80D69100"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v6 = 4; // const/4 v6, 0x4
	 final String v7 = "DELAYED_WRITE_TOKEN"; // const-string v7, "DELAYED_WRITE_TOKEN"
	 /* invoke-direct {v0, v7, v6, v1}, Le/h/d/a/a/o/a/h;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 /* .line 6 */
	 /* new-instance v0, Le/h/d/a/a/o/a/i; */
	 final String v1 = "80D80000"; // const-string v1, "80D80000"
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 int v7 = 5; // const/4 v7, 0x5
	 final String v8 = "TRANSACTION_DONE"; // const-string v8, "TRANSACTION_DONE"
	 /* invoke-direct {v0, v8, v7, v1}, Le/h/d/a/a/o/a/i;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
	 int v1 = 6; // const/4 v1, 0x6
	 /* new-array v1, v1, [Le/h/d/a/a/o/a/j; */
	 /* .line 7 */
	 v8 = e.h.d.a.a.o.a.j.c;
	 /* aput-object v8, v1, v2 */
	 v2 = e.h.d.a.a.o.a.j.d;
	 /* aput-object v2, v1, v3 */
	 v2 = e.h.d.a.a.o.a.j.e;
	 /* aput-object v2, v1, v4 */
	 v2 = e.h.d.a.a.o.a.j.f;
	 /* aput-object v2, v1, v5 */
	 v2 = e.h.d.a.a.o.a.j.g;
	 /* aput-object v2, v1, v6 */
	 /* aput-object v0, v1, v7 */
	 return;
} // .end method
public num ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lfr/mbs/binary/Octets;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 3 */
this.b = p3;
return;
} // .end method
public num ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3}, Le/h/d/a/a/o/a/j;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V */
return;
} // .end method
public static e.h.d.a.a.o.a.b a ( com.orange.oab.contactless.packid.hce.user.wallet.Wallet p0, fr.mbs.binary.Octets p1, Object p2, fr.mbs.binary.Octets p3, fr.mbs.binary.Octets p4 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 1 */
e.h.d.a.a.o.a.j .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 2 */
v4 = (( e.h.d.a.a.o.a.j ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Le/h/d/a/a/o/a/j;->a(Lfr/mbs/binary/Octets;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 3 */
(( e.h.d.a.a.o.a.j ) v3 ).a ( p0, p2, p3, p4 ); // invoke-virtual {v3, p0, p2, p3, p4}, Le/h/d/a/a/o/a/j;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
} // :cond_1
/* new-instance p0, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Unsupported APDU class, instruction or parameters on APDU "; // const-string p3, "Unsupported APDU class, instruction or parameters on APDU "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p2 = e.h.d.a.a.o.a.b.c;
/* invoke-direct {p0, p1, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p0 */
} // .end method
public static e.h.d.a.a.o.a.j valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/h/d/a/a/o/a/j; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/h/d/a/a/o/a/j; */
} // .end method
public static e.h.d.a.a.o.a.j values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.o.a.j.h;
(( e.h.d.a.a.o.a.j ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/h/d/a/a/o/a/j;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/h/d/a/a/o/a/j; */
} // .end method
/* # virtual methods */
public abstract e.h.d.a.a.o.a.b a ( com.orange.oab.contactless.packid.hce.user.wallet.Wallet p0, Object p1, fr.mbs.binary.Octets p2, fr.mbs.binary.Octets p3 ) {
} // .end method
public Boolean a ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 4; // const/4 v1, 0x4
/* .line 5 */
(( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
v0 = this.b;
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // .end method
