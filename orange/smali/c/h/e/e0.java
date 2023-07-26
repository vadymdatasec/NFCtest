public class c.h.e.e0 implements c.h.e.s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.app.Notification$Builder b;
	 public final c.h.e.c0$a c;
	 public android.widget.RemoteViews d;
	 public android.widget.RemoteViews e;
	 public final java.util.List f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Landroid/os/Bundle;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final android.os.Bundle g;
public Integer h;
public android.widget.RemoteViews i;
/* # direct methods */
public c.h.e.e0 ( ) {
/* .locals 13 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.f = v0;
/* .line 3 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
this.g = v0;
/* .line 4 */
this.c = p1;
/* .line 5 */
v0 = this.a;
this.a = v0;
/* .line 6 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 7 */
/* new-instance v0, Landroid/app/Notification$Builder; */
v2 = this.a;
v3 = this.K;
/* invoke-direct {v0, v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
this.b = v0;
/* .line 8 */
} // :cond_0
/* new-instance v0, Landroid/app/Notification$Builder; */
v2 = this.a;
/* invoke-direct {v0, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V */
this.b = v0;
/* .line 9 */
} // :goto_0
v0 = this.T;
/* .line 10 */
v2 = this.b;
/* iget-wide v3, v0, Landroid/app/Notification;->when:J */
(( android.app.Notification$Builder ) v2 ).setWhen ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->icon:I */
/* iget v4, v0, Landroid/app/Notification;->iconLevel:I */
/* .line 11 */
(( android.app.Notification$Builder ) v2 ).setSmallIcon ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;
v3 = this.contentView;
/* .line 12 */
(( android.app.Notification$Builder ) v2 ).setContent ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
v3 = this.tickerText;
v4 = this.i;
/* .line 13 */
(( android.app.Notification$Builder ) v2 ).setTicker ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
v3 = this.vibrate;
/* .line 14 */
(( android.app.Notification$Builder ) v2 ).setVibrate ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->ledARGB:I */
/* iget v4, v0, Landroid/app/Notification;->ledOnMS:I */
/* iget v5, v0, Landroid/app/Notification;->ledOffMS:I */
/* .line 15 */
(( android.app.Notification$Builder ) v2 ).setLights ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->flags:I */
int v4 = 2; // const/4 v4, 0x2
/* and-int/2addr v3, v4 */
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
if ( v3 != null) { // if-eqz v3, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 16 */
} // :goto_1
(( android.app.Notification$Builder ) v2 ).setOngoing ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit8 v3, v3, 0x8 */
if ( v3 != null) { // if-eqz v3, :cond_2
int v3 = 1; // const/4 v3, 0x1
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 17 */
} // :goto_2
(( android.app.Notification$Builder ) v2 ).setOnlyAlertOnce ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->flags:I */
/* const/16 v7, 0x10 */
/* and-int/2addr v3, v7 */
if ( v3 != null) { // if-eqz v3, :cond_3
int v3 = 1; // const/4 v3, 0x1
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
/* .line 18 */
} // :goto_3
(( android.app.Notification$Builder ) v2 ).setAutoCancel ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
/* iget v3, v0, Landroid/app/Notification;->defaults:I */
/* .line 19 */
(( android.app.Notification$Builder ) v2 ).setDefaults ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
v3 = this.e;
/* .line 20 */
(( android.app.Notification$Builder ) v2 ).setContentTitle ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
v3 = this.f;
/* .line 21 */
(( android.app.Notification$Builder ) v2 ).setContentText ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
v3 = this.k;
/* .line 22 */
(( android.app.Notification$Builder ) v2 ).setContentInfo ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
v3 = this.g;
/* .line 23 */
(( android.app.Notification$Builder ) v2 ).setContentIntent ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
v3 = this.deleteIntent;
/* .line 24 */
(( android.app.Notification$Builder ) v2 ).setDeleteIntent ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
v3 = this.h;
/* iget v8, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v8, v8, 0x80 */
if ( v8 != null) { // if-eqz v8, :cond_4
int v8 = 1; // const/4 v8, 0x1
} // :cond_4
int v8 = 0; // const/4 v8, 0x0
/* .line 25 */
} // :goto_4
(( android.app.Notification$Builder ) v2 ).setFullScreenIntent ( v3, v8 ); // invoke-virtual {v2, v3, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
v3 = this.j;
/* .line 26 */
(( android.app.Notification$Builder ) v2 ).setLargeIcon ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
/* iget v3, p1, Lc/h/e/c0$a;->l:I */
/* .line 27 */
(( android.app.Notification$Builder ) v2 ).setNumber ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;
/* iget v3, p1, Lc/h/e/c0$a;->t:I */
/* iget v8, p1, Lc/h/e/c0$a;->u:I */
/* iget-boolean v9, p1, Lc/h/e/c0$a;->v:Z */
/* .line 28 */
(( android.app.Notification$Builder ) v2 ).setProgress ( v3, v8, v9 ); // invoke-virtual {v2, v3, v8, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;
/* .line 29 */
/* const/16 v3, 0x15 */
/* if-ge v2, v3, :cond_5 */
/* .line 30 */
v2 = this.b;
v8 = this.sound;
/* iget v9, v0, Landroid/app/Notification;->audioStreamType:I */
(( android.app.Notification$Builder ) v2 ).setSound ( v8, v9 ); // invoke-virtual {v2, v8, v9}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
/* .line 31 */
} // :cond_5
/* const/16 v8, 0x14 */
/* if-lt v2, v7, :cond_c */
/* .line 32 */
v2 = this.b;
v7 = this.q;
(( android.app.Notification$Builder ) v2 ).setSubText ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
/* iget-boolean v7, p1, Lc/h/e/c0$a;->o:Z */
/* .line 33 */
(( android.app.Notification$Builder ) v2 ).setUsesChronometer ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;
/* iget v7, p1, Lc/h/e/c0$a;->m:I */
/* .line 34 */
(( android.app.Notification$Builder ) v2 ).setPriority ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;
/* .line 35 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v7 = } // :goto_5
if ( v7 != null) { // if-eqz v7, :cond_6
/* check-cast v7, Lc/h/e/t; */
/* .line 36 */
(( c.h.e.e0 ) p0 ).a ( v7 ); // invoke-virtual {p0, v7}, Lc/h/e/e0;->a(Lc/h/e/t;)V
/* .line 37 */
} // :cond_6
v2 = this.D;
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 38 */
v7 = this.g;
(( android.os.Bundle ) v7 ).putAll ( v2 ); // invoke-virtual {v7, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
/* .line 39 */
} // :cond_7
/* if-ge v2, v8, :cond_b */
/* .line 40 */
/* iget-boolean v2, p1, Lc/h/e/c0$a;->z:Z */
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 41 */
v2 = this.g;
final String v7 = "android.support.localOnly"; // const-string v7, "android.support.localOnly"
(( android.os.Bundle ) v2 ).putBoolean ( v7, v5 ); // invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 42 */
} // :cond_8
v2 = this.w;
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 43 */
v7 = this.g;
final String v9 = "android.support.groupKey"; // const-string v9, "android.support.groupKey"
(( android.os.Bundle ) v7 ).putString ( v9, v2 ); // invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 44 */
/* iget-boolean v2, p1, Lc/h/e/c0$a;->x:Z */
if ( v2 != null) { // if-eqz v2, :cond_9
/* .line 45 */
v2 = this.g;
final String v7 = "android.support.isGroupSummary"; // const-string v7, "android.support.isGroupSummary"
(( android.os.Bundle ) v2 ).putBoolean ( v7, v5 ); // invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 46 */
} // :cond_9
v2 = this.g;
final String v7 = "android.support.useSideChannel"; // const-string v7, "android.support.useSideChannel"
(( android.os.Bundle ) v2 ).putBoolean ( v7, v5 ); // invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 47 */
} // :cond_a
} // :goto_6
v2 = this.y;
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 48 */
v7 = this.g;
final String v9 = "android.support.sortKey"; // const-string v9, "android.support.sortKey"
(( android.os.Bundle ) v7 ).putString ( v9, v2 ); // invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 49 */
} // :cond_b
v2 = this.H;
this.d = v2;
/* .line 50 */
v2 = this.I;
this.e = v2;
/* .line 51 */
} // :cond_c
/* const/16 v7, 0x11 */
/* if-lt v2, v7, :cond_d */
/* .line 52 */
v2 = this.b;
/* iget-boolean v7, p1, Lc/h/e/c0$a;->n:Z */
(( android.app.Notification$Builder ) v2 ).setShowWhen ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;
/* .line 53 */
} // :cond_d
/* const/16 v7, 0x13 */
/* if-lt v2, v7, :cond_e */
/* if-ge v2, v3, :cond_e */
/* .line 54 */
v2 = this.c;
c.h.e.e0 .a ( v2 );
v7 = this.W;
c.h.e.e0 .a ( v2,v7 );
if ( v2 != null) { // if-eqz v2, :cond_e
v7 = /* .line 55 */
/* if-nez v7, :cond_e */
/* .line 56 */
v7 = this.g;
v9 = /* .line 57 */
/* new-array v9, v9, [Ljava/lang/String; */
/* check-cast v2, [Ljava/lang/String; */
final String v9 = "android.people"; // const-string v9, "android.people"
/* .line 58 */
(( android.os.Bundle ) v7 ).putStringArray ( v9, v2 ); // invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 59 */
} // :cond_e
/* if-lt v2, v8, :cond_f */
/* .line 60 */
v2 = this.b;
/* iget-boolean v7, p1, Lc/h/e/c0$a;->z:Z */
(( android.app.Notification$Builder ) v2 ).setLocalOnly ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;
v7 = this.w;
/* .line 61 */
(( android.app.Notification$Builder ) v2 ).setGroup ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* iget-boolean v7, p1, Lc/h/e/c0$a;->x:Z */
/* .line 62 */
(( android.app.Notification$Builder ) v2 ).setGroupSummary ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;
v7 = this.y;
/* .line 63 */
(( android.app.Notification$Builder ) v2 ).setSortKey ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* .line 64 */
/* iget v2, p1, Lc/h/e/c0$a;->P:I */
/* iput v2, p0, Lc/h/e/e0;->h:I */
/* .line 65 */
} // :cond_f
/* const/16 v7, 0x1c */
/* if-lt v2, v3, :cond_14 */
/* .line 66 */
v2 = this.b;
v3 = this.C;
(( android.app.Notification$Builder ) v2 ).setCategory ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* iget v3, p1, Lc/h/e/c0$a;->E:I */
/* .line 67 */
(( android.app.Notification$Builder ) v2 ).setColor ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;
/* iget v3, p1, Lc/h/e/c0$a;->F:I */
/* .line 68 */
(( android.app.Notification$Builder ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;
v3 = this.G;
/* .line 69 */
(( android.app.Notification$Builder ) v2 ).setPublicVersion ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;
v3 = this.sound;
v8 = this.audioAttributes;
/* .line 70 */
(( android.app.Notification$Builder ) v2 ).setSound ( v3, v8 ); // invoke-virtual {v2, v3, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;
/* .line 71 */
/* if-ge v2, v7, :cond_10 */
/* .line 72 */
v2 = this.c;
c.h.e.e0 .a ( v2 );
v3 = this.W;
c.h.e.e0 .a ( v2,v3 );
/* .line 73 */
} // :cond_10
v2 = this.W;
} // :goto_7
if ( v2 != null) { // if-eqz v2, :cond_11
v3 = /* .line 74 */
/* if-nez v3, :cond_11 */
/* .line 75 */
v3 = } // :goto_8
if ( v3 != null) { // if-eqz v3, :cond_11
/* check-cast v3, Ljava/lang/String; */
/* .line 76 */
v8 = this.b;
(( android.app.Notification$Builder ) v8 ).addPerson ( v3 ); // invoke-virtual {v8, v3}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* .line 77 */
} // :cond_11
v2 = this.J;
this.i = v2;
/* .line 78 */
v2 = this.d;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-lez v2, :cond_14 */
/* .line 79 */
(( c.h.e.c0$a ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/e/c0$a;->b()Landroid/os/Bundle;
final String v3 = "android.car.EXTENSIONS"; // const-string v3, "android.car.EXTENSIONS"
(( android.os.Bundle ) v2 ).getBundle ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* if-nez v2, :cond_12 */
/* .line 80 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 81 */
} // :cond_12
/* new-instance v8, Landroid/os/Bundle; */
/* invoke-direct {v8, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
/* .line 82 */
/* new-instance v9, Landroid/os/Bundle; */
/* invoke-direct {v9}, Landroid/os/Bundle;-><init>()V */
int v10 = 0; // const/4 v10, 0x0
/* .line 83 */
} // :goto_9
v11 = this.d;
v11 = (( java.util.ArrayList ) v11 ).size ( ); // invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
/* if-ge v10, v11, :cond_13 */
/* .line 84 */
java.lang.Integer .toString ( v10 );
v12 = this.d;
/* .line 85 */
(( java.util.ArrayList ) v12 ).get ( v10 ); // invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v12, Lc/h/e/t; */
/* .line 86 */
c.h.e.f0 .a ( v12 );
/* .line 87 */
(( android.os.Bundle ) v9 ).putBundle ( v11, v12 ); // invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_13
final String v10 = "invisible_actions"; // const-string v10, "invisible_actions"
/* .line 88 */
(( android.os.Bundle ) v2 ).putBundle ( v10, v9 ); // invoke-virtual {v2, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 89 */
(( android.os.Bundle ) v8 ).putBundle ( v10, v9 ); // invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 90 */
(( c.h.e.c0$a ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/e/c0$a;->b()Landroid/os/Bundle;
(( android.os.Bundle ) v9 ).putBundle ( v3, v2 ); // invoke-virtual {v9, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 91 */
v2 = this.g;
(( android.os.Bundle ) v2 ).putBundle ( v3, v8 ); // invoke-virtual {v2, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 92 */
} // :cond_14
/* const/16 v3, 0x17 */
/* if-lt v2, v3, :cond_15 */
/* .line 93 */
v2 = this.V;
if ( v2 != null) { // if-eqz v2, :cond_15
/* .line 94 */
v3 = this.b;
(( android.app.Notification$Builder ) v3 ).setSmallIcon ( v2 ); // invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setSmallIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;
/* .line 95 */
} // :cond_15
/* const/16 v3, 0x18 */
/* if-lt v2, v3, :cond_18 */
/* .line 96 */
v2 = this.b;
v3 = this.D;
(( android.app.Notification$Builder ) v2 ).setExtras ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
v3 = this.s;
/* .line 97 */
(( android.app.Notification$Builder ) v2 ).setRemoteInputHistory ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
/* .line 98 */
v2 = this.H;
if ( v2 != null) { // if-eqz v2, :cond_16
/* .line 99 */
v3 = this.b;
(( android.app.Notification$Builder ) v3 ).setCustomContentView ( v2 ); // invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
/* .line 100 */
} // :cond_16
v2 = this.I;
if ( v2 != null) { // if-eqz v2, :cond_17
/* .line 101 */
v3 = this.b;
(( android.app.Notification$Builder ) v3 ).setCustomBigContentView ( v2 ); // invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomBigContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
/* .line 102 */
} // :cond_17
v2 = this.J;
if ( v2 != null) { // if-eqz v2, :cond_18
/* .line 103 */
v3 = this.b;
(( android.app.Notification$Builder ) v3 ).setCustomHeadsUpContentView ( v2 ); // invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomHeadsUpContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
/* .line 104 */
} // :cond_18
int v3 = 0; // const/4 v3, 0x0
/* if-lt v2, v1, :cond_1a */
/* .line 105 */
v2 = this.b;
/* iget v8, p1, Lc/h/e/c0$a;->L:I */
(( android.app.Notification$Builder ) v2 ).setBadgeIconType ( v8 ); // invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;
v8 = this.r;
/* .line 106 */
(( android.app.Notification$Builder ) v2 ).setSettingsText ( v8 ); // invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
v8 = this.M;
/* .line 107 */
(( android.app.Notification$Builder ) v2 ).setShortcutId ( v8 ); // invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* iget-wide v8, p1, Lc/h/e/c0$a;->O:J */
/* .line 108 */
(( android.app.Notification$Builder ) v2 ).setTimeoutAfter ( v8, v9 ); // invoke-virtual {v2, v8, v9}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;
/* iget v8, p1, Lc/h/e/c0$a;->P:I */
/* .line 109 */
(( android.app.Notification$Builder ) v2 ).setGroupAlertBehavior ( v8 ); // invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;
/* .line 110 */
/* iget-boolean v2, p1, Lc/h/e/c0$a;->B:Z */
if ( v2 != null) { // if-eqz v2, :cond_19
/* .line 111 */
v2 = this.b;
/* iget-boolean v8, p1, Lc/h/e/c0$a;->A:Z */
(( android.app.Notification$Builder ) v2 ).setColorized ( v8 ); // invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setColorized(Z)Landroid/app/Notification$Builder;
/* .line 112 */
} // :cond_19
v2 = this.K;
v2 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v2, :cond_1a */
/* .line 113 */
v2 = this.b;
(( android.app.Notification$Builder ) v2 ).setSound ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;
/* .line 114 */
(( android.app.Notification$Builder ) v2 ).setDefaults ( v6 ); // invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
/* .line 115 */
(( android.app.Notification$Builder ) v2 ).setLights ( v6, v6, v6 ); // invoke-virtual {v2, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
/* .line 116 */
(( android.app.Notification$Builder ) v2 ).setVibrate ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
/* .line 117 */
} // :cond_1a
/* if-lt v2, v7, :cond_1b */
/* .line 118 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v6 = } // :goto_a
if ( v6 != null) { // if-eqz v6, :cond_1b
/* check-cast v6, Lc/h/e/g0; */
/* .line 119 */
v7 = this.b;
(( c.h.e.g0 ) v6 ).b ( ); // invoke-virtual {v6}, Lc/h/e/g0;->b()Landroid/app/Person;
(( android.app.Notification$Builder ) v7 ).addPerson ( v6 ); // invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->addPerson(Landroid/app/Person;)Landroid/app/Notification$Builder;
/* .line 120 */
} // :cond_1b
/* const/16 v6, 0x1d */
/* if-lt v2, v6, :cond_1c */
/* .line 121 */
v2 = this.b;
/* iget-boolean v6, p1, Lc/h/e/c0$a;->R:Z */
(( android.app.Notification$Builder ) v2 ).setAllowSystemGeneratedContextualActions ( v6 ); // invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;
/* .line 122 */
v2 = this.b;
v6 = this.S;
/* .line 123 */
c.h.e.b0 .a ( v6 );
/* .line 124 */
(( android.app.Notification$Builder ) v2 ).setBubbleMetadata ( v6 ); // invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;
/* .line 125 */
v2 = this.N;
if ( v2 != null) { // if-eqz v2, :cond_1c
/* .line 126 */
v6 = this.b;
(( c.h.f.g ) v2 ).a ( ); // invoke-virtual {v2}, Lc/h/f/g;->a()Landroid/content/LocusId;
(( android.app.Notification$Builder ) v6 ).setLocusId ( v2 ); // invoke-virtual {v6, v2}, Landroid/app/Notification$Builder;->setLocusId(Landroid/content/LocusId;)Landroid/app/Notification$Builder;
/* .line 127 */
} // :cond_1c
v2 = c.h.j.a .b ( );
if ( v2 != null) { // if-eqz v2, :cond_1d
/* .line 128 */
/* iget v2, p1, Lc/h/e/c0$a;->Q:I */
if ( v2 != null) { // if-eqz v2, :cond_1d
/* .line 129 */
v6 = this.b;
(( android.app.Notification$Builder ) v6 ).setForegroundServiceBehavior ( v2 ); // invoke-virtual {v6, v2}, Landroid/app/Notification$Builder;->setForegroundServiceBehavior(I)Landroid/app/Notification$Builder;
/* .line 130 */
} // :cond_1d
/* iget-boolean p1, p1, Lc/h/e/c0$a;->U:Z */
if ( p1 != null) { // if-eqz p1, :cond_20
/* .line 131 */
p1 = this.c;
/* iget-boolean p1, p1, Lc/h/e/c0$a;->x:Z */
if ( p1 != null) { // if-eqz p1, :cond_1e
/* .line 132 */
/* iput v4, p0, Lc/h/e/e0;->h:I */
/* .line 133 */
} // :cond_1e
/* iput v5, p0, Lc/h/e/e0;->h:I */
/* .line 134 */
} // :goto_b
p1 = this.b;
(( android.app.Notification$Builder ) p1 ).setVibrate ( v3 ); // invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
/* .line 135 */
p1 = this.b;
(( android.app.Notification$Builder ) p1 ).setSound ( v3 ); // invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;
/* .line 136 */
/* iget p1, v0, Landroid/app/Notification;->defaults:I */
/* and-int/lit8 p1, p1, -0x2 */
/* iput p1, v0, Landroid/app/Notification;->defaults:I */
/* and-int/lit8 p1, p1, -0x3 */
/* .line 137 */
/* iput p1, v0, Landroid/app/Notification;->defaults:I */
/* .line 138 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).setDefaults ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
/* .line 139 */
/* if-lt p1, v1, :cond_20 */
/* .line 140 */
p1 = this.c;
p1 = this.w;
p1 = android.text.TextUtils .isEmpty ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_1f
/* .line 141 */
p1 = this.b;
final String v0 = "silent"; // const-string v0, "silent"
(( android.app.Notification$Builder ) p1 ).setGroup ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;
/* .line 142 */
} // :cond_1f
p1 = this.b;
/* iget v0, p0, Lc/h/e/e0;->h:I */
(( android.app.Notification$Builder ) p1 ).setGroupAlertBehavior ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;
} // :cond_20
return;
} // .end method
public static java.util.List a ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/h/e/g0;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 5 */
} // :cond_0
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 6 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/h/e/g0; */
/* .line 7 */
(( c.h.e.g0 ) v1 ).a ( ); // invoke-virtual {v1}, Lc/h/e/g0;->a()Ljava/lang/String;
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
} // .end method
public static java.util.List a ( java.util.List p0, java.util.List p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 1 */
} // :cond_1
v2 = v1 = /* new-instance v0, Lc/e/d; */
/* add-int/2addr v1, v2 */
/* invoke-direct {v0, v1}, Lc/e/d;-><init>(I)V */
/* .line 2 */
(( c.e.d ) v0 ).addAll ( p0 ); // invoke-virtual {v0, p0}, Lc/e/d;->addAll(Ljava/util/Collection;)Z
/* .line 3 */
(( c.e.d ) v0 ).addAll ( p1 ); // invoke-virtual {v0, p1}, Lc/e/d;->addAll(Ljava/util/Collection;)Z
/* .line 4 */
/* new-instance p0, Ljava/util/ArrayList; */
/* invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
} // .end method
/* # virtual methods */
public android.app.Notification$Builder a ( ) {
/* .locals 1 */
/* .line 8 */
v0 = this.b;
} // .end method
public final void a ( android.app.Notification p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 44 */
this.sound = v0;
/* .line 45 */
this.vibrate = v0;
/* .line 46 */
/* iget v0, p1, Landroid/app/Notification;->defaults:I */
/* and-int/lit8 v0, v0, -0x2 */
/* iput v0, p1, Landroid/app/Notification;->defaults:I */
/* and-int/lit8 v0, v0, -0x3 */
/* .line 47 */
/* iput v0, p1, Landroid/app/Notification;->defaults:I */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 5 */
/* .line 9 */
/* const/16 v1, 0x14 */
/* if-lt v0, v1, :cond_8 */
/* .line 10 */
(( c.h.e.t ) p1 ).e ( ); // invoke-virtual {p1}, Lc/h/e/t;->e()Landroidx/core/graphics/drawable/IconCompat;
/* .line 11 */
/* const/16 v2, 0x17 */
int v3 = 0; // const/4 v3, 0x0
/* if-lt v1, v2, :cond_1 */
/* .line 12 */
/* new-instance v1, Landroid/app/Notification$Action$Builder; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 13 */
(( androidx.core.graphics.drawable.IconCompat ) v0 ).g ( ); // invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->g()Landroid/graphics/drawable/Icon;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 14 */
} // :goto_0
(( c.h.e.t ) p1 ).i ( ); // invoke-virtual {p1}, Lc/h/e/t;->i()Ljava/lang/CharSequence;
/* .line 15 */
(( c.h.e.t ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/e/t;->a()Landroid/app/PendingIntent;
/* invoke-direct {v1, v0, v2, v4}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V */
/* .line 16 */
} // :cond_1
/* new-instance v1, Landroid/app/Notification$Action$Builder; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 17 */
v0 = (( androidx.core.graphics.drawable.IconCompat ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->b()I
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 18 */
} // :goto_1
(( c.h.e.t ) p1 ).i ( ); // invoke-virtual {p1}, Lc/h/e/t;->i()Ljava/lang/CharSequence;
/* .line 19 */
(( c.h.e.t ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/e/t;->a()Landroid/app/PendingIntent;
/* invoke-direct {v1, v0, v2, v4}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V */
/* .line 20 */
} // :goto_2
(( c.h.e.t ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 21 */
(( c.h.e.t ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;
/* .line 22 */
c.h.e.h0 .a ( v0 );
/* array-length v2, v0 */
} // :goto_3
/* if-ge v3, v2, :cond_3 */
/* aget-object v4, v0, v3 */
/* .line 23 */
(( android.app.Notification$Action$Builder ) v1 ).addRemoteInput ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 24 */
} // :cond_3
(( c.h.e.t ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/e/t;->d()Landroid/os/Bundle;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 25 */
/* new-instance v0, Landroid/os/Bundle; */
(( c.h.e.t ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/e/t;->d()Landroid/os/Bundle;
/* invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
/* .line 26 */
} // :cond_4
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 27 */
} // :goto_4
v2 = (( c.h.e.t ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/e/t;->b()Z
final String v3 = "android.support.allowGeneratedReplies"; // const-string v3, "android.support.allowGeneratedReplies"
/* .line 28 */
(( android.os.Bundle ) v0 ).putBoolean ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 29 */
/* const/16 v3, 0x18 */
/* if-lt v2, v3, :cond_5 */
/* .line 30 */
v2 = (( c.h.e.t ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/e/t;->b()Z
(( android.app.Notification$Action$Builder ) v1 ).setAllowGeneratedReplies ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;
/* .line 31 */
} // :cond_5
v2 = (( c.h.e.t ) p1 ).g ( ); // invoke-virtual {p1}, Lc/h/e/t;->g()I
final String v3 = "android.support.action.semanticAction"; // const-string v3, "android.support.action.semanticAction"
/* .line 32 */
(( android.os.Bundle ) v0 ).putInt ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 33 */
/* const/16 v3, 0x1c */
/* if-lt v2, v3, :cond_6 */
/* .line 34 */
v2 = (( c.h.e.t ) p1 ).g ( ); // invoke-virtual {p1}, Lc/h/e/t;->g()I
(( android.app.Notification$Action$Builder ) v1 ).setSemanticAction ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setSemanticAction(I)Landroid/app/Notification$Action$Builder;
/* .line 35 */
} // :cond_6
/* const/16 v3, 0x1d */
/* if-lt v2, v3, :cond_7 */
/* .line 36 */
v2 = (( c.h.e.t ) p1 ).j ( ); // invoke-virtual {p1}, Lc/h/e/t;->j()Z
(( android.app.Notification$Action$Builder ) v1 ).setContextual ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;
/* .line 37 */
} // :cond_7
p1 = (( c.h.e.t ) p1 ).h ( ); // invoke-virtual {p1}, Lc/h/e/t;->h()Z
final String v2 = "android.support.action.showsUserInterface"; // const-string v2, "android.support.action.showsUserInterface"
/* .line 38 */
(( android.os.Bundle ) v0 ).putBoolean ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 39 */
(( android.app.Notification$Action$Builder ) v1 ).addExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;
/* .line 40 */
p1 = this.b;
(( android.app.Notification$Action$Builder ) v1 ).build ( ); // invoke-virtual {v1}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;
(( android.app.Notification$Builder ) p1 ).addAction ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;
} // :cond_8
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_9 */
/* .line 41 */
v0 = this.f;
v1 = this.b;
/* .line 42 */
c.h.e.f0 .a ( v1,p1 );
/* .line 43 */
} // :cond_9
} // :goto_5
return;
} // .end method
public android.app.Notification b ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.h.e.d0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/d0;->a(Lc/h/e/s;)V
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( c.h.e.d0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/d0;->c(Lc/h/e/s;)Landroid/widget/RemoteViews;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
(( c.h.e.e0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/e0;->c()Landroid/app/Notification;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
this.contentView = v1;
/* .line 6 */
} // :cond_2
v1 = this.c;
v1 = this.H;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 7 */
this.contentView = v1;
/* .line 8 */
} // :cond_3
} // :goto_1
/* const/16 v3, 0x10 */
/* if-lt v1, v3, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 9 */
(( c.h.e.d0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/e/d0;->b(Lc/h/e/s;)Landroid/widget/RemoteViews;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 10 */
this.bigContentView = v1;
/* .line 11 */
} // :cond_4
/* const/16 v4, 0x15 */
/* if-lt v1, v4, :cond_5 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 12 */
v1 = this.c;
v1 = this.p;
/* .line 13 */
(( c.h.e.d0 ) v1 ).d ( p0 ); // invoke-virtual {v1, p0}, Lc/h/e/d0;->d(Lc/h/e/s;)Landroid/widget/RemoteViews;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 14 */
this.headsUpContentView = v1;
/* .line 15 */
} // :cond_5
/* if-lt v1, v3, :cond_6 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 16 */
c.h.e.c0 .a ( v2 );
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 17 */
(( c.h.e.d0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/e/d0;->a(Landroid/os/Bundle;)V
} // :cond_6
} // .end method
public android.app.Notification c ( ) {
/* .locals 7 */
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
} // :cond_0
/* const/16 v1, 0x18 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 2; // const/4 v3, 0x2
/* if-lt v0, v1, :cond_3 */
/* .line 3 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
/* .line 4 */
/* iget v1, p0, Lc/h/e/e0;->h:I */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v3, :cond_1 */
/* .line 6 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
/* .line 7 */
} // :cond_1
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
/* if-nez v1, :cond_2 */
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v2, :cond_2 */
/* .line 8 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
} // :cond_2
} // :cond_3
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_9 */
/* .line 9 */
v0 = this.b;
v1 = this.g;
(( android.app.Notification$Builder ) v0 ).setExtras ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
/* .line 10 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
/* .line 11 */
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 12 */
this.contentView = v1;
/* .line 13 */
} // :cond_4
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 14 */
this.bigContentView = v1;
/* .line 15 */
} // :cond_5
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 16 */
this.headsUpContentView = v1;
/* .line 17 */
} // :cond_6
/* iget v1, p0, Lc/h/e/e0;->h:I */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 18 */
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_7
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
if ( v1 != null) { // if-eqz v1, :cond_7
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v3, :cond_7 */
/* .line 19 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
/* .line 20 */
} // :cond_7
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_8
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
/* if-nez v1, :cond_8 */
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v2, :cond_8 */
/* .line 21 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
} // :cond_8
} // :cond_9
/* const/16 v1, 0x14 */
/* if-lt v0, v1, :cond_e */
/* .line 22 */
v0 = this.b;
v1 = this.g;
(( android.app.Notification$Builder ) v0 ).setExtras ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
/* .line 23 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
/* .line 24 */
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 25 */
this.contentView = v1;
/* .line 26 */
} // :cond_a
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 27 */
this.bigContentView = v1;
/* .line 28 */
} // :cond_b
/* iget v1, p0, Lc/h/e/e0;->h:I */
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 29 */
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_c
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
if ( v1 != null) { // if-eqz v1, :cond_c
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v3, :cond_c */
/* .line 30 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
/* .line 31 */
} // :cond_c
(( android.app.Notification ) v0 ).getGroup ( ); // invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_d
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* and-int/lit16 v1, v1, 0x200 */
/* if-nez v1, :cond_d */
/* iget v1, p0, Lc/h/e/e0;->h:I */
/* if-ne v1, v2, :cond_d */
/* .line 32 */
(( c.h.e.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V
} // :cond_d
} // :cond_e
/* const/16 v1, 0x13 */
final String v2 = "android.support.actionExtras"; // const-string v2, "android.support.actionExtras"
/* if-lt v0, v1, :cond_12 */
/* .line 33 */
v0 = this.f;
/* .line 34 */
c.h.e.f0 .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_f
/* .line 35 */
v1 = this.g;
(( android.os.Bundle ) v1 ).putSparseParcelableArray ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
/* .line 36 */
} // :cond_f
v0 = this.b;
v1 = this.g;
(( android.app.Notification$Builder ) v0 ).setExtras ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
/* .line 37 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
/* .line 38 */
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_10
/* .line 39 */
this.contentView = v1;
/* .line 40 */
} // :cond_10
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 41 */
this.bigContentView = v1;
} // :cond_11
} // :cond_12
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_18 */
/* .line 42 */
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
/* .line 43 */
c.h.e.c0 .a ( v0 );
/* .line 44 */
/* new-instance v3, Landroid/os/Bundle; */
v4 = this.g;
/* invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V */
/* .line 45 */
v4 = this.g;
(( android.os.Bundle ) v4 ).keySet ( ); // invoke-virtual {v4}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
} // :cond_13
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_14
/* check-cast v5, Ljava/lang/String; */
/* .line 46 */
v6 = (( android.os.Bundle ) v1 ).containsKey ( v5 ); // invoke-virtual {v1, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_13
/* .line 47 */
(( android.os.Bundle ) v3 ).remove ( v5 ); // invoke-virtual {v3, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
/* .line 48 */
} // :cond_14
(( android.os.Bundle ) v1 ).putAll ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
/* .line 49 */
v1 = this.f;
/* .line 50 */
c.h.e.f0 .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_15
/* .line 51 */
c.h.e.c0 .a ( v0 );
(( android.os.Bundle ) v3 ).putSparseParcelableArray ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
/* .line 52 */
} // :cond_15
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_16
/* .line 53 */
this.contentView = v1;
/* .line 54 */
} // :cond_16
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_17
/* .line 55 */
this.bigContentView = v1;
} // :cond_17
/* .line 56 */
} // :cond_18
v0 = this.b;
(( android.app.Notification$Builder ) v0 ).getNotification ( ); // invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;
} // .end method
public android.content.Context d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
