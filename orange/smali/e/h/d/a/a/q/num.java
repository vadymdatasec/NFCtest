public abstract class num extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/h/d/a/a/q/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.h.d.a.a.q.i c;
public static final e.h.d.a.a.q.i d;
public static final e.h.d.a.a.q.i e;
public static final e.h.d.a.a.q.i f;
public static final e.h.d.a.a.q.i g; //synthetic
/* # instance fields */
public final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType b;
/* # direct methods */
public static num ( ) {
	 /* .locals 8 */
	 /* .line 1 */
	 /* new-instance v0, Le/h/d/a/a/q/d; */
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.START;
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "START"; // const-string v3, "START"
	 /* invoke-direct {v0, v3, v2, v1}, Le/h/d/a/a/q/d;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
	 /* .line 2 */
	 /* new-instance v0, Le/h/d/a/a/q/e; */
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INTERRUPTED;
	 int v3 = 1; // const/4 v3, 0x1
	 final String v4 = "INTERRUPTED"; // const-string v4, "INTERRUPTED"
	 /* invoke-direct {v0, v4, v3, v1}, Le/h/d/a/a/q/e;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
	 /* .line 3 */
	 /* new-instance v0, Le/h/d/a/a/q/f; */
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
	 int v4 = 2; // const/4 v4, 0x2
	 final String v5 = "ERROR"; // const-string v5, "ERROR"
	 /* invoke-direct {v0, v5, v4, v1}, Le/h/d/a/a/q/f;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
	 /* .line 4 */
	 /* new-instance v0, Le/h/d/a/a/q/g; */
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
	 int v5 = 3; // const/4 v5, 0x3
	 final String v6 = "DONE"; // const-string v6, "DONE"
	 /* invoke-direct {v0, v6, v5, v1}, Le/h/d/a/a/q/g;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
	 /* .line 5 */
	 /* new-instance v0, Le/h/d/a/a/q/h; */
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INSUFFICIENT_SECURITY;
	 int v6 = 4; // const/4 v6, 0x4
	 final String v7 = "INSUFFICIENT_SECURITY"; // const-string v7, "INSUFFICIENT_SECURITY"
	 /* invoke-direct {v0, v7, v6, v1}, Le/h/d/a/a/q/h;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
	 int v1 = 5; // const/4 v1, 0x5
	 /* new-array v1, v1, [Le/h/d/a/a/q/i; */
	 /* .line 6 */
	 v7 = e.h.d.a.a.q.i.c;
	 /* aput-object v7, v1, v2 */
	 v2 = e.h.d.a.a.q.i.d;
	 /* aput-object v2, v1, v3 */
	 v2 = e.h.d.a.a.q.i.e;
	 /* aput-object v2, v1, v4 */
	 v2 = e.h.d.a.a.q.i.f;
	 /* aput-object v2, v1, v5 */
	 /* aput-object v0, v1, v6 */
	 return;
} // .end method
public num ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;", */
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
/* invoke-direct {p0, p1, p2, p3}, Le/h/d/a/a/q/i;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
return;
} // .end method
public static e.h.d.a.a.q.c a ( android.content.Context p0, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p1, java.lang.Integer p2, java.lang.String p3 ) {
/* .locals 0 */
/* .line 4 */
e.h.d.a.a.q.i .a ( p1 );
(( e.h.d.a.a.q.i ) p1 ).a ( p0, p2, p3 ); // invoke-virtual {p1, p0, p2, p3}, Le/h/d/a/a/q/i;->a(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/b;
(( e.h.d.a.a.q.b ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/q/b;->a()Le/h/d/a/a/q/c;
} // .end method
public static e.h.d.a.a.q.i a ( com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p0 ) {
/* .locals 5 */
/* .line 1 */
e.h.d.a.a.q.i .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 2 */
v4 = this.b;
/* if-ne v4, p0, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No "; // const-string v2, "No "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-class v2, Le/h/d/a/a/q/i; */
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " for event type "; // const-string v2, " for event type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static e.h.d.a.a.q.i valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/h/d/a/a/q/i; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/h/d/a/a/q/i; */
} // .end method
public static e.h.d.a.a.q.i values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.q.i.g;
(( e.h.d.a.a.q.i ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/h/d/a/a/q/i;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/h/d/a/a/q/i; */
} // .end method
/* # virtual methods */
public abstract e.h.d.a.a.q.b a ( android.content.Context p0, java.lang.Integer p1, java.lang.String p2 ) {
} // .end method
