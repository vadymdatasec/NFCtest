.class public Lc/h/e/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/e/s;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/Notification$Builder;

.field public final c:Lc/h/e/c0$a;

.field public d:Landroid/widget/RemoteViews;

.field public e:Landroid/widget/RemoteViews;

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Landroid/os/Bundle;

.field public h:I

.field public i:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>(Lc/h/e/c0$a;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/h/e/e0;->f:Ljava/util/List;

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    .line 4
    iput-object p1, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    .line 5
    iget-object v0, p1, Lc/h/e/c0$a;->a:Landroid/content/Context;

    iput-object v0, p0, Lc/h/e/e0;->a:Landroid/content/Context;

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v2, p1, Lc/h/e/c0$a;->a:Landroid/content/Context;

    iget-object v3, p1, Lc/h/e/c0$a;->K:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v2, p1, Lc/h/e/c0$a;->a:Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    .line 9
    :goto_0
    iget-object v0, p1, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    .line 10
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-wide v3, v0, Landroid/app/Notification;->when:J

    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->icon:I

    iget v4, v0, Landroid/app/Notification;->iconLevel:I

    .line 11
    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 12
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iget-object v4, p1, Lc/h/e/c0$a;->i:Landroid/widget/RemoteViews;

    .line 13
    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v0, Landroid/app/Notification;->vibrate:[J

    .line 14
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->ledARGB:I

    iget v4, v0, Landroid/app/Notification;->ledOnMS:I

    iget v5, v0, Landroid/app/Notification;->ledOffMS:I

    .line 15
    invoke-virtual {v2, v3, v4, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->flags:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 16
    :goto_1
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 17
    :goto_2
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->flags:I

    const/16 v7, 0x10

    and-int/2addr v3, v7

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    .line 18
    :goto_3
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v0, Landroid/app/Notification;->defaults:I

    .line 19
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->e:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->f:Ljava/lang/CharSequence;

    .line 21
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->k:Ljava/lang/CharSequence;

    .line 22
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->g:Landroid/app/PendingIntent;

    .line 23
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 24
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->h:Landroid/app/PendingIntent;

    iget v8, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v8, v8, 0x80

    if-eqz v8, :cond_4

    const/4 v8, 0x1

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    .line 25
    :goto_4
    invoke-virtual {v2, v3, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->j:Landroid/graphics/Bitmap;

    .line 26
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, p1, Lc/h/e/c0$a;->l:I

    .line 27
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, p1, Lc/h/e/c0$a;->t:I

    iget v8, p1, Lc/h/e/c0$a;->u:I

    iget-boolean v9, p1, Lc/h/e/c0$a;->v:Z

    .line 28
    invoke-virtual {v2, v3, v8, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 29
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_5

    .line 30
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v8, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v9, v0, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v2, v8, v9}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    .line 31
    :cond_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x14

    if-lt v2, v7, :cond_c

    .line 32
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Lc/h/e/c0$a;->q:Ljava/lang/CharSequence;

    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-boolean v7, p1, Lc/h/e/c0$a;->o:Z

    .line 33
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v7, p1, Lc/h/e/c0$a;->m:I

    .line 34
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 35
    iget-object v2, p1, Lc/h/e/c0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/h/e/t;

    .line 36
    invoke-virtual {p0, v7}, Lc/h/e/e0;->a(Lc/h/e/t;)V

    goto :goto_5

    .line 37
    :cond_6
    iget-object v2, p1, Lc/h/e/c0$a;->D:Landroid/os/Bundle;

    if-eqz v2, :cond_7

    .line 38
    iget-object v7, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v7, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 39
    :cond_7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v2, v8, :cond_b

    .line 40
    iget-boolean v2, p1, Lc/h/e/c0$a;->z:Z

    if-eqz v2, :cond_8

    .line 41
    iget-object v2, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    const-string v7, "android.support.localOnly"

    invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    :cond_8
    iget-object v2, p1, Lc/h/e/c0$a;->w:Ljava/lang/String;

    if-eqz v2, :cond_a

    .line 43
    iget-object v7, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    const-string v9, "android.support.groupKey"

    invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    iget-boolean v2, p1, Lc/h/e/c0$a;->x:Z

    if-eqz v2, :cond_9

    .line 45
    iget-object v2, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    const-string v7, "android.support.isGroupSummary"

    invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_6

    .line 46
    :cond_9
    iget-object v2, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    const-string v7, "android.support.useSideChannel"

    invoke-virtual {v2, v7, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 47
    :cond_a
    :goto_6
    iget-object v2, p1, Lc/h/e/c0$a;->y:Ljava/lang/String;

    if-eqz v2, :cond_b

    .line 48
    iget-object v7, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    const-string v9, "android.support.sortKey"

    invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_b
    iget-object v2, p1, Lc/h/e/c0$a;->H:Landroid/widget/RemoteViews;

    iput-object v2, p0, Lc/h/e/e0;->d:Landroid/widget/RemoteViews;

    .line 50
    iget-object v2, p1, Lc/h/e/c0$a;->I:Landroid/widget/RemoteViews;

    iput-object v2, p0, Lc/h/e/e0;->e:Landroid/widget/RemoteViews;

    .line 51
    :cond_c
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x11

    if-lt v2, v7, :cond_d

    .line 52
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Lc/h/e/c0$a;->n:Z

    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 53
    :cond_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x13

    if-lt v2, v7, :cond_e

    if-ge v2, v3, :cond_e

    .line 54
    iget-object v2, p1, Lc/h/e/c0$a;->c:Ljava/util/ArrayList;

    invoke-static {v2}, Lc/h/e/e0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v7, p1, Lc/h/e/c0$a;->W:Ljava/util/ArrayList;

    invoke-static {v2, v7}, Lc/h/e/e0;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 55
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_e

    .line 56
    iget-object v7, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    .line 57
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    new-array v9, v9, [Ljava/lang/String;

    invoke-interface {v2, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const-string v9, "android.people"

    .line 58
    invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 59
    :cond_e
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v8, :cond_f

    .line 60
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Lc/h/e/c0$a;->z:Z

    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v7, p1, Lc/h/e/c0$a;->w:Ljava/lang/String;

    .line 61
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-boolean v7, p1, Lc/h/e/c0$a;->x:Z

    .line 62
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v7, p1, Lc/h/e/c0$a;->y:Ljava/lang/String;

    .line 63
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 64
    iget v2, p1, Lc/h/e/c0$a;->P:I

    iput v2, p0, Lc/h/e/e0;->h:I

    .line 65
    :cond_f
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1c

    if-lt v2, v3, :cond_14

    .line 66
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v3, p1, Lc/h/e/c0$a;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, p1, Lc/h/e/c0$a;->E:I

    .line 67
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, p1, Lc/h/e/c0$a;->F:I

    .line 68
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->G:Landroid/app/Notification;

    .line 69
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v8, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 70
    invoke-virtual {v2, v3, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 71
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v2, v7, :cond_10

    .line 72
    iget-object v2, p1, Lc/h/e/c0$a;->c:Ljava/util/ArrayList;

    invoke-static {v2}, Lc/h/e/e0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->W:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lc/h/e/e0;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_7

    .line 73
    :cond_10
    iget-object v2, p1, Lc/h/e/c0$a;->W:Ljava/util/ArrayList;

    :goto_7
    if-eqz v2, :cond_11

    .line 74
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    .line 75
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 76
    iget-object v8, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v8, v3}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_8

    .line 77
    :cond_11
    iget-object v2, p1, Lc/h/e/c0$a;->J:Landroid/widget/RemoteViews;

    iput-object v2, p0, Lc/h/e/e0;->i:Landroid/widget/RemoteViews;

    .line 78
    iget-object v2, p1, Lc/h/e/c0$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_14

    .line 79
    invoke-virtual {p1}, Lc/h/e/c0$a;->b()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "android.car.EXTENSIONS"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_12

    .line 80
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 81
    :cond_12
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 82
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const/4 v10, 0x0

    .line 83
    :goto_9
    iget-object v11, p1, Lc/h/e/c0$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_13

    .line 84
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iget-object v12, p1, Lc/h/e/c0$a;->d:Ljava/util/ArrayList;

    .line 85
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lc/h/e/t;

    .line 86
    invoke-static {v12}, Lc/h/e/f0;->a(Lc/h/e/t;)Landroid/os/Bundle;

    move-result-object v12

    .line 87
    invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_13
    const-string v10, "invisible_actions"

    .line 88
    invoke-virtual {v2, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 89
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 90
    invoke-virtual {p1}, Lc/h/e/c0$a;->b()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 91
    iget-object v2, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 92
    :cond_14
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_15

    .line 93
    iget-object v2, p1, Lc/h/e/c0$a;->V:Landroid/graphics/drawable/Icon;

    if-eqz v2, :cond_15

    .line 94
    iget-object v3, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setSmallIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 95
    :cond_15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_18

    .line 96
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v3, p1, Lc/h/e/c0$a;->D:Landroid/os/Bundle;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p1, Lc/h/e/c0$a;->s:[Ljava/lang/CharSequence;

    .line 97
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 98
    iget-object v2, p1, Lc/h/e/c0$a;->H:Landroid/widget/RemoteViews;

    if-eqz v2, :cond_16

    .line 99
    iget-object v3, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 100
    :cond_16
    iget-object v2, p1, Lc/h/e/c0$a;->I:Landroid/widget/RemoteViews;

    if-eqz v2, :cond_17

    .line 101
    iget-object v3, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomBigContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 102
    :cond_17
    iget-object v2, p1, Lc/h/e/c0$a;->J:Landroid/widget/RemoteViews;

    if-eqz v2, :cond_18

    .line 103
    iget-object v3, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setCustomHeadsUpContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 104
    :cond_18
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x0

    if-lt v2, v1, :cond_1a

    .line 105
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget v8, p1, Lc/h/e/c0$a;->L:I

    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v8, p1, Lc/h/e/c0$a;->r:Ljava/lang/CharSequence;

    .line 106
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v8, p1, Lc/h/e/c0$a;->M:Ljava/lang/String;

    .line 107
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-wide v8, p1, Lc/h/e/c0$a;->O:J

    .line 108
    invoke-virtual {v2, v8, v9}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v8, p1, Lc/h/e/c0$a;->P:I

    .line 109
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 110
    iget-boolean v2, p1, Lc/h/e/c0$a;->B:Z

    if-eqz v2, :cond_19

    .line 111
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-boolean v8, p1, Lc/h/e/c0$a;->A:Z

    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setColorized(Z)Landroid/app/Notification$Builder;

    .line 112
    :cond_19
    iget-object v2, p1, Lc/h/e/c0$a;->K:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1a

    .line 113
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 114
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 115
    invoke-virtual {v2, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 116
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 117
    :cond_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v7, :cond_1b

    .line 118
    iget-object v2, p1, Lc/h/e/c0$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc/h/e/g0;

    .line 119
    iget-object v7, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v6}, Lc/h/e/g0;->b()Landroid/app/Person;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->addPerson(Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_a

    .line 120
    :cond_1b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v2, v6, :cond_1c

    .line 121
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-boolean v6, p1, Lc/h/e/c0$a;->R:Z

    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    .line 122
    iget-object v2, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v6, p1, Lc/h/e/c0$a;->S:Lc/h/e/b0;

    .line 123
    invoke-static {v6}, Lc/h/e/b0;->a(Lc/h/e/b0;)Landroid/app/Notification$BubbleMetadata;

    move-result-object v6

    .line 124
    invoke-virtual {v2, v6}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 125
    iget-object v2, p1, Lc/h/e/c0$a;->N:Lc/h/f/g;

    if-eqz v2, :cond_1c

    .line 126
    iget-object v6, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v2}, Lc/h/f/g;->a()Landroid/content/LocusId;

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/app/Notification$Builder;->setLocusId(Landroid/content/LocusId;)Landroid/app/Notification$Builder;

    .line 127
    :cond_1c
    invoke-static {}, Lc/h/j/a;->b()Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 128
    iget v2, p1, Lc/h/e/c0$a;->Q:I

    if-eqz v2, :cond_1d

    .line 129
    iget-object v6, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v6, v2}, Landroid/app/Notification$Builder;->setForegroundServiceBehavior(I)Landroid/app/Notification$Builder;

    .line 130
    :cond_1d
    iget-boolean p1, p1, Lc/h/e/c0$a;->U:Z

    if-eqz p1, :cond_20

    .line 131
    iget-object p1, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    iget-boolean p1, p1, Lc/h/e/c0$a;->x:Z

    if-eqz p1, :cond_1e

    .line 132
    iput v4, p0, Lc/h/e/e0;->h:I

    goto :goto_b

    .line 133
    :cond_1e
    iput v5, p0, Lc/h/e/e0;->h:I

    .line 134
    :goto_b
    iget-object p1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 135
    iget-object p1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 136
    iget p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x2

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x3

    .line 137
    iput p1, v0, Landroid/app/Notification;->defaults:I

    .line 138
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 139
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v1, :cond_20

    .line 140
    iget-object p1, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    iget-object p1, p1, Lc/h/e/c0$a;->w:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1f

    .line 141
    iget-object p1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    const-string v0, "silent"

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 142
    :cond_1f
    iget-object p1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget v0, p0, Lc/h/e/e0;->h:I

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    :cond_20
    return-void
.end method

.method public static a(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/h/e/g0;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/h/e/g0;

    .line 7
    invoke-virtual {v1}, Lc/h/e/g0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 1
    :cond_1
    new-instance v0, Lc/e/d;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Lc/e/d;-><init>(I)V

    .line 2
    invoke-virtual {v0, p0}, Lc/e/d;->addAll(Ljava/util/Collection;)Z

    .line 3
    invoke-virtual {v0, p1}, Lc/e/d;->addAll(Ljava/util/Collection;)Z

    .line 4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    .line 8
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public final a(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 45
    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 46
    iget v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x3

    .line 47
    iput v0, p1, Landroid/app/Notification;->defaults:I

    return-void
.end method

.method public final a(Lc/h/e/t;)V
    .locals 5

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_8

    .line 10
    invoke-virtual {p1}, Lc/h/e/t;->e()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    .line 12
    new-instance v1, Landroid/app/Notification$Action$Builder;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->g()Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-virtual {p1}, Lc/h/e/t;->i()Ljava/lang/CharSequence;

    move-result-object v2

    .line 15
    invoke-virtual {p1}, Lc/h/e/t;->a()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-direct {v1, v0, v2, v4}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    goto :goto_2

    .line 16
    :cond_1
    new-instance v1, Landroid/app/Notification$Action$Builder;

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->b()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 18
    :goto_1
    invoke-virtual {p1}, Lc/h/e/t;->i()Ljava/lang/CharSequence;

    move-result-object v2

    .line 19
    invoke-virtual {p1}, Lc/h/e/t;->a()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-direct {v1, v0, v2, v4}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 20
    :goto_2
    invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    invoke-virtual {p1}, Lc/h/e/t;->f()[Lc/h/e/h0;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lc/h/e/h0;->a([Lc/h/e/h0;)[Landroid/app/RemoteInput;

    move-result-object v0

    array-length v2, v0

    :goto_3
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    .line 23
    invoke-virtual {v1, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 24
    :cond_3
    invoke-virtual {p1}, Lc/h/e/t;->d()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 25
    new-instance v0, Landroid/os/Bundle;

    invoke-virtual {p1}, Lc/h/e/t;->d()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_4

    .line 26
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 27
    :goto_4
    invoke-virtual {p1}, Lc/h/e/t;->b()Z

    move-result v2

    const-string v3, "android.support.allowGeneratedReplies"

    .line 28
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_5

    .line 30
    invoke-virtual {p1}, Lc/h/e/t;->b()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 31
    :cond_5
    invoke-virtual {p1}, Lc/h/e/t;->g()I

    move-result v2

    const-string v3, "android.support.action.semanticAction"

    .line 32
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 33
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_6

    .line 34
    invoke-virtual {p1}, Lc/h/e/t;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setSemanticAction(I)Landroid/app/Notification$Action$Builder;

    .line 35
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_7

    .line 36
    invoke-virtual {p1}, Lc/h/e/t;->j()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;

    .line 37
    :cond_7
    invoke-virtual {p1}, Lc/h/e/t;->h()Z

    move-result p1

    const-string v2, "android.support.action.showsUserInterface"

    .line 38
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    invoke-virtual {v1, v0}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 40
    iget-object p1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v1}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    goto :goto_5

    :cond_8
    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    .line 41
    iget-object v0, p0, Lc/h/e/e0;->f:Ljava/util/List;

    iget-object v1, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    .line 42
    invoke-static {v1, p1}, Lc/h/e/f0;->a(Landroid/app/Notification$Builder;Lc/h/e/t;)Landroid/os/Bundle;

    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    return-void
.end method

.method public b()Landroid/app/Notification;
    .locals 5

    .line 1
    iget-object v0, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    iget-object v0, v0, Lc/h/e/c0$a;->p:Lc/h/e/d0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Lc/h/e/d0;->a(Lc/h/e/s;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p0}, Lc/h/e/d0;->c(Lc/h/e/s;)Landroid/widget/RemoteViews;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lc/h/e/e0;->c()Landroid/app/Notification;

    move-result-object v2

    if-eqz v1, :cond_2

    .line 5
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    goto :goto_1

    .line 6
    :cond_2
    iget-object v1, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    iget-object v1, v1, Lc/h/e/c0$a;->H:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_3

    .line 7
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 8
    :cond_3
    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v1, v3, :cond_4

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {v0, p0}, Lc/h/e/d0;->b(Lc/h/e/s;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 10
    iput-object v1, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 11
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v1, v4, :cond_5

    if-eqz v0, :cond_5

    .line 12
    iget-object v1, p0, Lc/h/e/e0;->c:Lc/h/e/c0$a;

    iget-object v1, v1, Lc/h/e/c0$a;->p:Lc/h/e/d0;

    .line 13
    invoke-virtual {v1, p0}, Lc/h/e/d0;->d(Lc/h/e/s;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 14
    iput-object v1, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 15
    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v3, :cond_6

    if-eqz v0, :cond_6

    .line 16
    invoke-static {v2}, Lc/h/e/c0;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 17
    invoke-virtual {v0, v1}, Lc/h/e/d0;->a(Landroid/os/Bundle;)V

    :cond_6
    return-object v2
.end method

.method public c()Landroid/app/Notification;
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v1, 0x18

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-lt v0, v1, :cond_3

    .line 3
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 4
    iget v1, p0, Lc/h/e/e0;->h:I

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_1

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v3, :cond_1

    .line 6
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    .line 7
    :cond_1
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_2

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v2, :cond_2

    .line 8
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    :cond_2
    return-object v0

    :cond_3
    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    .line 9
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 10
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lc/h/e/e0;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_4

    .line 12
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 13
    :cond_4
    iget-object v1, p0, Lc/h/e/e0;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_5

    .line 14
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 15
    :cond_5
    iget-object v1, p0, Lc/h/e/e0;->i:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_6

    .line 16
    iput-object v1, v0, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 17
    :cond_6
    iget v1, p0, Lc/h/e/e0;->h:I

    if-eqz v1, :cond_8

    .line 18
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_7

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v3, :cond_7

    .line 19
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    .line 20
    :cond_7
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_8

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v2, :cond_8

    .line 21
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    :cond_8
    return-object v0

    :cond_9
    const/16 v1, 0x14

    if-lt v0, v1, :cond_e

    .line 22
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 23
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lc/h/e/e0;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_a

    .line 25
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 26
    :cond_a
    iget-object v1, p0, Lc/h/e/e0;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_b

    .line 27
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 28
    :cond_b
    iget v1, p0, Lc/h/e/e0;->h:I

    if-eqz v1, :cond_d

    .line 29
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_c

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v3, :cond_c

    .line 30
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    .line 31
    :cond_c
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_d

    iget v1, p0, Lc/h/e/e0;->h:I

    if-ne v1, v2, :cond_d

    .line 32
    invoke-virtual {p0, v0}, Lc/h/e/e0;->a(Landroid/app/Notification;)V

    :cond_d
    return-object v0

    :cond_e
    const/16 v1, 0x13

    const-string v2, "android.support.actionExtras"

    if-lt v0, v1, :cond_12

    .line 33
    iget-object v0, p0, Lc/h/e/e0;->f:Ljava/util/List;

    .line 34
    invoke-static {v0}, Lc/h/e/f0;->a(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 35
    iget-object v1, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 36
    :cond_f
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 37
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lc/h/e/e0;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_10

    .line 39
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 40
    :cond_10
    iget-object v1, p0, Lc/h/e/e0;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_11

    .line 41
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_11
    return-object v0

    :cond_12
    const/16 v1, 0x10

    if-lt v0, v1, :cond_18

    .line 42
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 43
    invoke-static {v0}, Lc/h/e/c0;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    .line 44
    new-instance v3, Landroid/os/Bundle;

    iget-object v4, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 45
    iget-object v4, p0, Lc/h/e/e0;->g:Landroid/os/Bundle;

    invoke-virtual {v4}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_13
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 46
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 47
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 48
    :cond_14
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 49
    iget-object v1, p0, Lc/h/e/e0;->f:Ljava/util/List;

    .line 50
    invoke-static {v1}, Lc/h/e/f0;->a(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v1

    if-eqz v1, :cond_15

    .line 51
    invoke-static {v0}, Lc/h/e/c0;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 52
    :cond_15
    iget-object v1, p0, Lc/h/e/e0;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_16

    .line 53
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 54
    :cond_16
    iget-object v1, p0, Lc/h/e/e0;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_17

    .line 55
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_17
    return-object v0

    .line 56
    :cond_18
    iget-object v0, p0, Lc/h/e/e0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/e/e0;->a:Landroid/content/Context;

    return-object v0
.end method
