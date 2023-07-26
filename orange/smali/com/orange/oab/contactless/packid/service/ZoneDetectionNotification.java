public class com.orange.oab.contactless.packid.service.ZoneDetectionNotification {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.Context a;
	 public java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/Date;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.orange.oab.contactless.packid.service.ZoneDetectionNotification ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 4 */
this.a = p1;
return;
} // .end method
public static android.content.SharedPreferences a ( android.content.Context p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2 ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int p2 = 0; // const/4 p2, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
public static Boolean isAutorised ( android.content.Context p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2 ) {
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.service.ZoneDetectionNotification .a ( p0,p1,p2 );
final String p1 = "notificationAutorised"; // const-string p1, "notificationAutorised"
p0 = int p2 = 1; // const/4 p2, 0x1
} // .end method
public static void saveAutorisedValue ( android.content.Context p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2, Boolean p3 ) {
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.service.ZoneDetectionNotification .a ( p0,p1,p2 );
final String p1 = "notificationAutorised"; // const-string p1, "notificationAutorised"
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 28 */
v0 = this.c;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 29 */
/* check-cast v1, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V
} // :cond_0
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
/* .line 30 */
v0 = e.h.d.a.a.r.b.k;
v1 = this.a;
(( e.h.d.a.a.r.b ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;I)V
/* .line 31 */
v0 = this.b;
java.lang.Integer .valueOf ( p1 );
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 8 */
/* .line 5 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getZoneId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* .line 6 */
v1 = (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
/* .line 7 */
v2 = this.c;
java.lang.Integer .valueOf ( v1 );
e.h.d.a.a.n.t .b ( );
/* .line 8 */
v2 = (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(I)Z
/* if-nez v2, :cond_0 */
/* .line 9 */
v2 = this.b;
java.lang.Integer .valueOf ( v1 );
/* .line 10 */
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"; // const-string v3, "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"
/* invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v3 = "contactlessId"; // const-string v3, "contactlessId"
/* .line 11 */
(( android.content.Intent ) v2 ).putExtra ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
final String v4 = "zoneId"; // const-string v4, "zoneId"
/* .line 12 */
(( android.content.Intent ) v2 ).putExtra ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 13 */
v5 = this.a;
/* const/high16 v6, 0x4000000 */
android.app.PendingIntent .getBroadcast ( v5,v1,v2,v6 );
/* .line 14 */
/* new-instance v5, Landroid/content/Intent; */
final String v7 = "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"; // const-string v7, "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"
/* invoke-direct {v5, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 15 */
(( android.content.Intent ) v5 ).putExtra ( v3, p1 ); // invoke-virtual {v5, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 16 */
(( android.content.Intent ) v5 ).putExtra ( v4, v0 ); // invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 17 */
p1 = this.a;
/* add-int/lit8 v0, v1, 0x1 */
android.app.PendingIntent .getBroadcast ( p1,v0,v5,v6 );
/* .line 18 */
v0 = e.h.d.a.a.r.b.k;
v3 = this.a;
(( e.h.d.a.a.r.b ) v0 ).f ( v3 ); // invoke-virtual {v0, v3}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;
/* .line 19 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getDescription ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( c.h.e.c0$a ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
p2 = this.a;
/* .line 20 */
(( android.content.Context ) p2 ).getString ( v3 ); // invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( c.h.e.c0$a ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/h/e/c0$a;->a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
/* .line 21 */
(( c.h.e.c0$a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
p2 = this.a;
/* .line 22 */
(( android.content.Context ) p2 ).getResources ( ); // invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
android.graphics.BitmapFactory .decodeResource ( p2,v2 );
(( c.h.e.c0$a ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Landroid/graphics/Bitmap;)Lc/h/e/c0$a;
/* .line 23 */
(( c.h.e.c0$a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
/* .line 24 */
(( c.h.e.c0$a ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;
/* .line 25 */
java.lang.String .valueOf ( v1 );
(( c.h.e.c0$a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Ljava/lang/String;)Lc/h/e/c0$a;
/* .line 26 */
(( c.h.e.c0$a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;
/* .line 27 */
p2 = e.h.d.a.a.r.b.k;
v0 = this.a;
(( e.h.d.a.a.r.b ) p2 ).a ( v0, p1, v1 ); // invoke-virtual {p2, v0, p1, v1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;I)V
} // :cond_0
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
/* .line 2 */
v1 = this.b;
java.lang.Integer .valueOf ( v0 );
/* .line 3 */
v0 = this.a;
com.orange.oab.contactless.packid.service.ZoneDetectionNotification .a ( v0,p1,p2 );
final String p2 = "notificationAutorised"; // const-string p2, "notificationAutorised"
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
public final Integer b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 0 */
/* .line 1 */
fr.mbs.binary.Octets .createOctets ( p1 );
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).toBigInteger ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBigInteger()Ljava/math/BigInteger;
p1 = (( java.math.BigInteger ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I
} // .end method
public void b ( ) {
/* .locals 4 */
/* .line 2 */
v0 = this.c;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/util/Map$Entry; */
/* const/16 v2, 0x1388 */
/* .line 3 */
e.h.d.a.a.n.t .a ( v2 );
/* .line 4 */
/* check-cast v3, Ljava/util/Date; */
v2 = (( java.util.Date ) v3 ).before ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
/* check-cast v1, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V
} // :cond_1
return;
} // .end method
public final Boolean b ( Integer p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.b;
p1 = java.lang.Integer .valueOf ( p1 );
} // .end method
public final Boolean c ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
/* .line 2 */
v1 = this.a;
p1 = com.orange.oab.contactless.packid.service.ZoneDetectionNotification .isAutorised ( v1,p1,p2 );
/* if-nez p1, :cond_0 */
/* .line 3 */
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V
} // :cond_0
} // .end method
