public class com.orange.hce.proto.widget.PackIdWidgetService$b implements android.widget.RemoteViewsService$RemoteViewsFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/widget/PackIdWidgetService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # static fields */
public static java.util.List g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static java.util.concurrent.ConcurrentHashMap h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public android.content.Context a;
public java.util.concurrent.ConcurrentHashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.concurrent.ConcurrentHashMap c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public android.widget.RemoteViews d;
public android.content.BroadcastReceiver e;
public android.content.BroadcastReceiver f;
/* # direct methods */
public static com.orange.hce.proto.widget.PackIdWidgetService$b ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
return;
} // .end method
public com.orange.hce.proto.widget.PackIdWidgetService$b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.b = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Le/h/b/a/q/a; */
/* invoke-direct {v0, p0}, Le/h/b/a/q/a;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V */
this.e = v0;
/* .line 5 */
/* new-instance v0, Le/h/b/a/q/c; */
/* invoke-direct {v0, p0}, Le/h/b/a/q/c;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V */
this.f = v0;
/* .line 6 */
this.a = p1;
return;
} // .end method
public static android.content.Context a ( com.orange.hce.proto.widget.PackIdWidgetService$b p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
p0 = this.a;
} // .end method
public static e.h.b.a.m.d a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
/* .line 26 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
v0 = if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez v0, :cond_1 */
/* .line 27 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/h/b/a/m/d; */
/* .line 28 */
(( e.h.b.a.m.d ) v1 ).d ( ); // invoke-virtual {v1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( p0 ); // invoke-virtual {v2, p0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
(( e.h.b.a.m.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.util.List a ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
} // .end method
public static void a ( com.orange.hce.proto.widget.PackIdWidgetService$b p0, Object p1, java.util.concurrent.ConcurrentHashMap p2, Integer p3, java.util.TimerTask p4 ) { //synthethic
/* .locals 0 */
/* .line 3 */
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
return;
} // .end method
public static void a ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/h/b/a/m/d;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 25 */
return;
} // .end method
public static java.util.concurrent.ConcurrentHashMap b ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.h;
} // .end method
public static java.util.concurrent.ConcurrentHashMap c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 8 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.h;
} // .end method
/* # virtual methods */
public final void a ( android.widget.RemoteViews p0, Object p1 ) {
/* .locals 4 */
/* .line 4 */
(( e.h.b.a.m.d ) p2 ).g ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->g()Ljava/lang/String;
/* const v0, 0x7f08005b */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
java.net.URI .create ( p2 );
(( java.net.URI ) v1 ).getScheme ( ); // invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;
/* if-nez v1, :cond_0 */
/* .line 6 */
} // :cond_0
try { // :try_start_0
v1 = this.a;
e.b.a.d .d ( v1 );
/* .line 7 */
(( e.b.a.u ) v1 ).d ( ); // invoke-virtual {v1}, Le/b/a/u;->d()Le/b/a/s;
/* .line 8 */
android.net.Uri .parse ( p2 );
(( e.b.a.s ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Le/b/a/s;->a(Landroid/net/Uri;)Le/b/a/s;
/* const/16 v1, 0x200 */
/* .line 9 */
(( e.b.a.s ) p2 ).c ( v1, v1 ); // invoke-virtual {p2, v1, v1}, Le/b/a/s;->c(II)Le/b/a/c0/c;
/* .line 10 */
/* check-cast p2, Landroid/graphics/Bitmap; */
/* .line 11 */
(( android.widget.RemoteViews ) p1 ).setImageViewBitmap ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String p2 = "PackIdWidgetItemFactory"; // const-string p2, "PackIdWidgetItemFactory"
final String v0 = "Error when loading badgeWidgetLogo"; // const-string v0, "Error when loading badgeWidgetLogo"
/* .line 12 */
android.util.Log .e ( p2,v0,p1 );
} // :cond_1
} // :goto_0
/* if-nez p2, :cond_2 */
final String p2 = "connection"; // const-string p2, "connection"
/* .line 13 */
} // :cond_2
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v2 = this.a;
(( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v3 = "drawable"; // const-string v3, "drawable"
p2 = (( android.content.res.Resources ) v1 ).getIdentifier ( p2, v3, v2 ); // invoke-virtual {v1, p2, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 14 */
(( android.widget.RemoteViews ) p1 ).setImageViewResource ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
} // :cond_3
} // :goto_1
return;
} // .end method
public final void a ( android.widget.RemoteViews p0, Object p1, Integer p2 ) {
/* .locals 2 */
/* const v0, 0x7f0801a1 */
int v1 = 4; // const/4 v1, 0x4
/* .line 15 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
int v0 = 0; // const/4 v0, 0x0
/* .line 16 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 17 */
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
(( e.h.b.a.m.i ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/b/a/m/i;->a()Ljava/lang/String;
(( android.widget.RemoteViews ) p1 ).setTextViewText ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 18 */
(( e.h.b.a.m.d ) p2 ).j ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->j()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 19 */
(( e.h.b.a.m.d ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public final void a ( Object p0, java.util.concurrent.ConcurrentHashMap p1, Integer p2, java.util.TimerTask p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;I", */
/* "Ljava/util/TimerTask;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 20 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).get ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Timer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 21 */
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 22 */
} // :cond_0
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* int-to-long v1, p3 */
/* .line 23 */
(( java.util.Timer ) v0 ).schedule ( p4, v1, v2 ); // invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 24 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).put ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public final void b ( android.widget.RemoteViews p0, Object p1 ) {
/* .locals 4 */
/* .line 2 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 3 */
(( e.h.b.a.m.d ) p2 ).k ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->k()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
v2 = com.orange.oab.contactless.packid.rssi.RssiLevel.ZERO;
v1 = (( java.lang.Enum ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
/* const v2, 0x7f08005c */
/* if-nez v1, :cond_1 */
v1 = (( e.h.b.a.m.d ) p2 ).y ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z
/* if-nez v1, :cond_0 */
} // :cond_0
/* const v1, 0x7f070060 */
/* .line 4 */
(( android.widget.RemoteViews ) p1 ).setImageViewResource ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
/* .line 5 */
(( e.h.b.a.m.d ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toString ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
final String v3 = "ContactLessId"; // const-string v3, "ContactLessId"
(( android.content.Intent ) v0 ).putExtra ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 6 */
(( e.h.b.a.m.d ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toString ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
final String v3 = "ZoneId"; // const-string v3, "ZoneId"
(( android.content.Intent ) v0 ).putExtra ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // :cond_1
} // :goto_0
/* const v1, 0x7f070062 */
/* .line 7 */
(( android.widget.RemoteViews ) p1 ).setImageViewResource ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
int v1 = 1; // const/4 v1, 0x1
final String v3 = "StartApplication"; // const-string v3, "StartApplication"
/* .line 8 */
(( android.content.Intent ) v0 ).putExtra ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 9 */
} // :goto_1
(( android.widget.RemoteViews ) p1 ).setOnClickFillInIntent ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/widget/RemoteViews;->setOnClickFillInIntent(ILandroid/content/Intent;)V
/* .line 10 */
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->c(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
return;
} // .end method
public final void c ( android.widget.RemoteViews p0, Object p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$a.a;
(( e.h.b.a.m.d ) p2 ).p ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* const v2, 0x7f080144 */
/* if-eq v0, v1, :cond_2 */
int v1 = 2; // const/4 v1, 0x2
/* const v3, 0x7f080092 */
/* if-eq v0, v1, :cond_1 */
int p2 = 3; // const/4 p2, 0x3
/* const v1, 0x7f0801a1 */
/* if-eq v0, p2, :cond_0 */
int p2 = 4; // const/4 p2, 0x4
/* .line 2 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( v2, p2 ); // invoke-virtual {p1, v2, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 3 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( v3, p2 ); // invoke-virtual {p1, v3, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 4 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 5 */
(( android.widget.RemoteViews ) p1 ).setViewVisibility ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 6 */
} // :cond_1
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).a ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;I)V
/* .line 7 */
} // :cond_2
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).a ( p1, p2, v2 ); // invoke-virtual {p0, p1, p2, v2}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;I)V
} // :goto_0
return;
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public android.widget.RemoteViews getLoadingView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.widget.RemoteViews getViewAt ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroid/widget/RemoteViews; */
v1 = this.a;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const v2, 0x7f0b0027 */
/* invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
this.d = v0;
/* .line 2 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
/* check-cast p1, Le/h/b/a/m/d; */
/* .line 3 */
v0 = this.d;
(( e.h.b.a.m.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;
/* const v2, 0x7f08005e */
(( android.widget.RemoteViews ) v0 ).setTextViewText ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 4 */
v0 = this.d;
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->b(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
/* .line 5 */
v0 = this.d;
(( com.orange.hce.proto.widget.PackIdWidgetService$b ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
/* .line 6 */
p1 = this.d;
} // .end method
public Integer getViewTypeCount ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean hasStableIds ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onCreate ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
c.p.a.d .a ( v0 );
v1 = this.e;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"; // const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 2 */
v0 = this.a;
c.p.a.d .a ( v0 );
v1 = this.f;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
return;
} // .end method
public void onDataSetChanged ( ) {
/* .locals 0 */
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.g;
/* .line 2 */
v0 = com.orange.hce.proto.widget.PackIdWidgetService$b.h;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
/* .line 3 */
v0 = this.b;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
/* .line 4 */
v0 = this.c;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
/* .line 5 */
v0 = this.a;
c.p.a.d .a ( v0 );
v1 = this.e;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 6 */
v0 = this.a;
c.p.a.d .a ( v0 );
v1 = this.f;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
