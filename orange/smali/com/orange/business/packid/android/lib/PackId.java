public class com.orange.business.packid.android.lib.PackId {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String PACKID_SCHEME;
	 public static java.util.concurrent.atomic.AtomicBoolean b;
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public static com.orange.business.packid.android.lib.PackId ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
		 return;
	 } // .end method
	 public com.orange.business.packid.android.lib.PackId ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 final String v0 = "packid"; // const-string v0, "packid"
		 final String v1 = "Instantiate PackId"; // const-string v1, "Instantiate PackId"
		 /* .line 2 */
		 android.util.Log .i ( v0,v1 );
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.net.Uri a ( android.net.Uri p0 ) {
		 /* .locals 2 */
		 /* .line 8 */
		 (( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
		 (( com.orange.business.packid.android.lib.PackId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 9 */
		 /* new-instance v1, Landroid/net/Uri$Builder; */
		 /* invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V */
		 (( android.net.Uri$Builder ) v1 ).scheme ( v0 ); // invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
		 (( android.net.Uri ) p1 ).getEncodedSchemeSpecificPart ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;
		 (( android.net.Uri$Builder ) v0 ).encodedOpaquePart ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedOpaquePart(Ljava/lang/String;)Landroid/net/Uri$Builder;
		 (( android.net.Uri ) p1 ).getEncodedFragment ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getEncodedFragment()Ljava/lang/String;
		 (( android.net.Uri$Builder ) v0 ).encodedFragment ( p1 ); // invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;
		 (( android.net.Uri$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
	 } // .end method
	 public final java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "packid"; // const-string v0, "packid"
		 /* .line 10 */
		 v0 = 		 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 final String v1 = "http"; // const-string v1, "http"
		 /* if-nez v0, :cond_1 */
		 p1 = 		 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 final String p1 = "https"; // const-string p1, "https"
	 } // :cond_1
} // :goto_0
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = e.h.d.a.a.n.s .b ( v0 );
/* if-nez v0, :cond_0 */
/* .line 2 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).clear ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V
/* .line 3 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/r/a;->b()V
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "Key guard not secured send broadcast com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"; // const-string v1, "Key guard not secured send broadcast com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"
/* .line 4 */
android.util.Log .w ( v0,v1 );
} // :cond_0
return;
} // .end method
public final void a ( android.content.Intent p0 ) {
/* .locals 2 */
/* .line 5 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 6 */
v0 = this.a;
(( android.content.Context ) v0 ).startForegroundService ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
/* .line 7 */
} // :cond_0
v0 = this.a;
(( android.content.Context ) v0 ).startService ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
} // :goto_0
return;
} // .end method
public void activatePersistentLogs ( Boolean p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
java.lang.Boolean .valueOf ( v0 );
com.orange.oab.contactless.packid.service.LogManager .startPersistentLog ( p1,v0 );
/* .line 2 */
} // :cond_0
p1 = this.a;
com.orange.oab.contactless.packid.service.LogManager .stopPersistentLogs ( p1 );
} // :goto_0
return;
} // .end method
public final void b ( ) {
/* .locals 4 */
/* .line 1 */
v0 = e.h.d.a.a.r.b.l;
v1 = this.a;
(( e.h.d.a.a.r.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V
/* .line 2 */
v0 = e.h.d.a.a.r.b.j;
v1 = this.a;
(( e.h.d.a.a.r.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V
/* .line 3 */
v0 = e.h.d.a.a.r.b.i;
v1 = this.a;
(( e.h.d.a.a.r.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V
/* .line 4 */
v0 = e.h.d.a.a.r.b.k;
v1 = this.a;
(( e.h.d.a.a.r.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V
/* .line 5 */
v0 = this.a;
c.p.a.d .a ( v0 );
/* new-instance v1, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver; */
/* invoke-direct {v1}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;-><init>()V */
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
return;
} // .end method
public final void c ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
c.p.a.d .a ( v0 );
/* new-instance v1, Le/h/d/a/a/r/c; */
/* invoke-direct {v1}, Le/h/d/a/a/r/c;-><init>()V */
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
return;
} // .end method
public void clear ( ) {
/* .locals 2 */
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "clear called"; // const-string v1, "clear called"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
v0 = this.a;
e.h.d.a.a.n.u .a ( v0 );
return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.User createDefaultUser ( ) {
/* .locals 6 */
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "createDefaultUser called"; // const-string v1, "createDefaultUser called"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
v1 = e.h.d.a.a.n.w.c .b ( v1,v2 );
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
try { // :try_start_0
v1 = this.a;
com.orange.oab.contactless.packid.hce.user.User .defaultUser ( v1 );
/* .line 4 */
v3 = this.a;
e.h.d.a.a.s.m .c ( v3 );
(( e.h.d.a.a.s.g0 ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;)Le/h/d/a/a/p/a/a/a;
/* .line 5 */
v4 = this.a;
com.orange.oab.contactless.packid.service.Aid .register ( v4 );
/* .line 6 */
/* new-instance v4, Le/h/d/a/a/r/a; */
v5 = this.a;
/* invoke-direct {v4, v5}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
final String v3 = "Can\'t create default User: "; // const-string v3, "Can\'t create default User: "
/* .line 7 */
android.util.Log .w ( v0,v3,v1 );
} // .end method
public final void d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
e.h.a.a.a.a.b .a ( v0,v1 );
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "Starting service Pack ID"; // const-string v1, "Starting service Pack ID"
/* .line 2 */
android.util.Log .i ( v0,v1 );
/* .line 3 */
/* new-instance v0, Landroid/content/Intent; */
v1 = this.a;
/* const-class v2, Lcom/orange/oab/contactless/packid/service/PackIdService; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.orange.business.packid.android.lib.PackId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V
return;
} // .end method
public final void e ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
final String v1 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"
/* .line 2 */
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 3 */
v1 = this.a;
c.p.a.d .a ( v1 );
/* new-instance v2, Le/h/d/a/a/r/d; */
/* invoke-direct {v2}, Le/h/d/a/a/r/d;-><init>()V */
(( c.p.a.d ) v1 ).a ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
return;
} // .end method
public final void f ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
final String v1 = "com.orange.oab.contactless.packid.action.UPDATE_USERS"; // const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"
/* .line 2 */
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
final String v1 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v1, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
/* .line 3 */
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 4 */
v1 = this.a;
c.p.a.d .a ( v1 );
/* new-instance v2, Le/h/d/a/a/r/e; */
/* invoke-direct {v2}, Le/h/d/a/a/r/e;-><init>()V */
(( c.p.a.d ) v1 ).a ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
return;
} // .end method
public java.util.List findTransactionsByZoneId ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lfr/mbs/binary/Octets;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/domain/Transaction;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "findTransactionsByZoneId for zone "; // const-string v1, "findTransactionsByZoneId for zone "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " called"; // const-string v1, " called"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid"; // const-string v1, "packid"
android.util.Log .i ( v1,v0 );
/* .line 2 */
v0 = this.a;
e.h.d.a.a.s.m .b ( v0 );
/* const/16 v1, 0x14 */
(( e.h.d.a.a.s.c0 ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/h/d/a/a/s/c0;->a(Lfr/mbs/binary/Octets;I)Ljava/util/List;
} // .end method
public com.orange.oab.contactless.packid.rssi.RssiLevel forceLevelUpdateForBadge ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, com.orange.oab.contactless.packid.hce.user.User p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = e.h.d.a.a.v.b.e;
v1 = this.a;
(( e.h.d.a.a.v.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) v0 ).a ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/h/d/a/a/v/b;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
} // .end method
public void forceRssiSignalEventsUpdate ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.h.d.a.a.v.b.e;
v1 = this.a;
(( e.h.d.a.a.v.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/v/b;->b()V
/* .line 2 */
v0 = e.h.d.a.a.v.b.e;
v1 = this.a;
(( e.h.d.a.a.v.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/v/b;->a()V
return;
} // .end method
public Boolean forceStatusUpdateForBadge ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, com.orange.oab.contactless.packid.hce.user.User p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = e.h.d.a.a.v.b.e;
v1 = this.a;
(( e.h.d.a.a.v.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/h/d/a/a/v/b; */
p1 = (( e.h.d.a.a.v.b ) v0 ).b ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/h/d/a/a/v/b;->b(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
} // .end method
public java.util.List getContactlessIds ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "getContactlessIds called"; // const-string v1, "getContactlessIds called"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 3 */
v1 = this.a;
e.h.d.a.a.s.m .c ( v1 );
(( e.h.d.a.a.s.g0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getContactlessId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // .end method
public com.orange.oab.contactless.packid.hce.user.User getUserByContactlessId ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "getUserByContactlessId for contactlessId "; // const-string v1, "getUserByContactlessId for contactlessId "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " called"; // const-string v1, " called"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid"; // const-string v1, "packid"
android.util.Log .i ( v1,v0 );
/* .line 2 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* invoke-direct {p1}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V */
/* throw p1 */
} // .end method
public java.util.List getUsers ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "getUsers called"; // const-string v1, "getUsers called"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
} // .end method
public Boolean hasBleBadges ( ) {
/* .locals 3 */
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "hasBleBadges called"; // const-string v1, "hasBleBadges called"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).getUsers ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
/* .line 3 */
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getBadges ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v2 = } // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 5 */
v2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).isNfcOnly ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z
/* if-nez v2, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isPersistentLogsActive ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = e.h.a.a.a.a.b .c ( v0 );
} // .end method
public void register ( android.net.Uri p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).register ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;Ljava/lang/String;)V
return;
} // .end method
public void register ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "register called with uri "; // const-string v1, "register called with uri "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid"; // const-string v1, "packid"
android.util.Log .i ( v1,v0 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
v0 = this.a;
int v2 = 1; // const/4 v2, 0x1
v0 = e.h.d.a.a.n.w.c .b ( v0,v2 );
/* if-nez v0, :cond_0 */
final String p1 = "Can\'t register while configuration is not initialized"; // const-string p1, "Can\'t register while configuration is not initialized"
/* .line 4 */
android.util.Log .e ( v1,p1 );
return;
/* .line 5 */
} // :cond_0
/* new-instance v0, Le/h/d/a/a/n/p; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/n/p;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/net/Uri;)Landroid/net/Uri;
(( e.h.d.a.a.n.p ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/d/a/a/n/p;->b(Landroid/net/Uri;Ljava/lang/String;)V
return;
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/NullPointerException; */
final String p2 = "User public reference URI is required when registering!"; // const-string p2, "User public reference URI is required when registering!"
/* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void start ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).start ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->start(Z)V
return;
} // .end method
public void start ( Boolean p0 ) {
/* .locals 1 */
/* .line 2 */
java.util.Collections .emptyMap ( );
(( com.orange.business.packid.android.lib.PackId ) p0 ).start ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->start(ZLjava/util/Map;)V
return;
} // .end method
public void start ( Boolean p0, java.util.Map p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(Z", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.a;
e.h.d.a.a.n.w.d .a ( v0 );
/* .line 4 */
v0 = this.a;
e.h.a.a.a.a.a .a ( v0 );
/* .line 5 */
(( e.h.a.a.a.a.a ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/a/a/a/a/a;->a(Ljava/util/Map;)V
/* .line 6 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->a()V
final String p2 = "packid"; // const-string p2, "packid"
final String v0 = "start called"; // const-string v0, "start called"
/* .line 7 */
android.util.Log .i ( p2,v0 );
/* .line 8 */
v0 = com.orange.business.packid.android.lib.PackId.b;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).compareAndSet ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
/* if-nez v0, :cond_0 */
final String p1 = "Pack ID service should be started only once by application lifecycle"; // const-string p1, "Pack ID service should be started only once by application lifecycle"
/* .line 9 */
android.util.Log .w ( p2,p1 );
return;
/* .line 10 */
} // :cond_0
v0 = this.a;
e.d.a.a.b .a ( v0,v1 );
/* .line 11 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Starting Pack ID service (useUiNotificationsOnContactlessTransaction: "; // const-string v1, "Starting Pack ID service (useUiNotificationsOnContactlessTransaction: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( p2,v0 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 12 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->b()V
/* .line 13 */
} // :cond_1
(( com.orange.business.packid.android.lib.PackId ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->c()V
/* .line 14 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->e()V
/* .line 15 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->f()V
/* .line 16 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->d()V
return;
} // .end method
public void startBle ( ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
e.h.a.a.a.a.b .a ( v0,v1 );
/* .line 2 */
/* new-instance v0, Landroid/content/Intent; */
v1 = this.a;
/* const-class v2, Lcom/orange/oab/contactless/packid/service/PackIdService; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.orange.business.packid.android.lib.PackId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V
return;
} // .end method
public void startBleTransaction ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "startBleTransaction called for contactlessId"; // const-string v1, "startBleTransaction called for contactlessId"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " and zone "; // const-string v1, " and zone "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid"; // const-string v1, "packid"
android.util.Log .i ( v1,v0 );
/* .line 2 */
try { // :try_start_0
(( com.orange.business.packid.android.lib.PackId ) p0 ).getUserByContactlessId ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
/* .line 3 */
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getWallet ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findBadgeByZone ( p2 ); // invoke-virtual {v0, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 4 */
v2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isBle ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isBle()Z
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
final String v3 = " on contactless id "; // const-string v3, " on contactless id "
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
try { // :try_start_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Start BLE transaction for badge "; // const-string v4, "Start BLE transaction for badge "
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getDescription ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v0 );
/* .line 6 */
/* new-instance v0, Landroid/content/Intent; */
v2 = this.a;
/* const-class v3, Lcom/orange/oab/contactless/packid/service/PackIdService; */
/* invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v2 = "contactlessId"; // const-string v2, "contactlessId"
/* .line 7 */
(( android.content.Intent ) v0 ).putExtra ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
final String v2 = "zoneId"; // const-string v2, "zoneId"
/* .line 8 */
(( android.content.Intent ) v0 ).putExtra ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 9 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V
/* .line 10 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Trying to start BLE transaction on not BLE badge "; // const-string v4, "Trying to start BLE transaction on not BLE badge "
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getDescription ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,v0 );
/* :try_end_1 */
/* .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 11 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Trying to start ble transaction on unknown zone id "; // const-string v2, "Trying to start ble transaction on unknown zone id "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " for contactless id "; // const-string p2, " for contactless id "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1 );
/* .line 12 */
/* :catch_1 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Trying to start ble transaction on unknown contactless id "; // const-string v0, "Trying to start ble transaction on unknown contactless id "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1 );
} // :goto_0
return;
} // .end method
public void startBroadcastRSSI ( ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
int v1 = 1; // const/4 v1, 0x1
(( com.orange.business.packid.android.lib.PackIdPreferences ) v0 ).setEnableRssiBroadcast ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiBroadcast(Z)V
return;
} // .end method
public void startBroadcastRSSILevel ( ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
int v1 = 1; // const/4 v1, 0x1
(( com.orange.business.packid.android.lib.PackIdPreferences ) v0 ).setEnableRssiLevelBroadcast ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiLevelBroadcast(Z)V
return;
} // .end method
public void startPersistentLogs ( android.content.Context p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
java.lang.Boolean .valueOf ( v0 );
(( com.orange.business.packid.android.lib.PackId ) p0 ).startPersistentLogs ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->startPersistentLogs(Landroid/content/Context;Ljava/lang/Boolean;)V
return;
} // .end method
public void startPersistentLogs ( android.content.Context p0, java.lang.Boolean p1 ) {
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .startPersistentLog ( p1,p2 );
return;
} // .end method
public void stopBle ( ) {
/* .locals 4 */
final String v0 = "packid"; // const-string v0, "packid"
final String v1 = "Stopping service Pack ID BLE"; // const-string v1, "Stopping service Pack ID BLE"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
e.h.a.a.a.a.b .a ( v0,v1 );
/* .line 3 */
v0 = this.a;
/* new-instance v1, Landroid/content/Intent; */
v2 = this.a;
/* const-class v3, Lcom/orange/oab/contactless/packid/service/PackIdService; */
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( android.content.Context ) v0 ).stopService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
return;
} // .end method
public void stopBroadcastRSSI ( ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
int v1 = 0; // const/4 v1, 0x0
(( com.orange.business.packid.android.lib.PackIdPreferences ) v0 ).setEnableRssiBroadcast ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiBroadcast(Z)V
return;
} // .end method
public void stopBroadcastRSSILevel ( ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
int v1 = 0; // const/4 v1, 0x0
(( com.orange.business.packid.android.lib.PackIdPreferences ) v0 ).setEnableRssiLevelBroadcast ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiLevelBroadcast(Z)V
return;
} // .end method
public void stopPersistentLogs ( android.content.Context p0 ) {
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.service.LogManager .stopPersistentLogs ( p1 );
return;
} // .end method
public void update ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).update ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V
return;
} // .end method
public void update ( Boolean p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).update ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V
return;
} // .end method
public void update ( Boolean p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "update called with"; // const-string v1, "update called with"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( p1 != null) { // if-eqz p1, :cond_0
final String v1 = ""; // const-string v1, ""
} // :cond_0
final String v1 = "out"; // const-string v1, "out"
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " alert on errors"; // const-string v1, " alert on errors"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid"; // const-string v1, "packid"
android.util.Log .i ( v1,v0 );
/* .line 4 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
int v1 = 1; // const/4 v1, 0x1
(( e.h.d.a.a.r.a ) v0 ).a ( p1, v1, p2 ); // invoke-virtual {v0, p1, v1, p2}, Le/h/d/a/a/r/a;->a(ZZLjava/lang/String;)V
return;
} // .end method
public void writeToLogs ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
(( com.orange.business.packid.android.lib.PackId ) p0 ).writeToLogs ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->writeToLogs(Ljava/lang/String;Z)V
return;
} // .end method
public void writeToLogs ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( v0,p1,p2 );
return;
} // .end method
