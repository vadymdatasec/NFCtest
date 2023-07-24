.class public Lcom/orange/hce/proto/widget/PackIdWidgetService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RemoteViewsService$RemoteViewsFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/hce/proto/widget/PackIdWidgetService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/widget/RemoteViews;

.field public e:Landroid/content/BroadcastReceiver;

.field public f:Landroid/content/BroadcastReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    new-instance v0, Le/h/b/a/q/a;

    invoke-direct {v0, p0}, Le/h/b/a/q/a;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V

    iput-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->e:Landroid/content/BroadcastReceiver;

    .line 5
    new-instance v0, Le/h/b/a/q/c;

    invoke-direct {v0, p0}, Le/h/b/a/q/c;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V

    iput-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->f:Landroid/content/BroadcastReceiver;

    .line 6
    iput-object p1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)Landroid/content/Context;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;
    .locals 3

    .line 26
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 27
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/b/a/m/d;

    .line 28
    invoke-virtual {v1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2, p0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V

    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/h/b/a/m/d;",
            ">;)V"
        }
    .end annotation

    .line 25
    sput-object p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    return-void
.end method

.method public static synthetic b()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static c()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;"
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
    .locals 4

    .line 4
    invoke-virtual {p2}, Le/h/b/a/m/d;->g()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f08005b

    if-eqz p2, :cond_1

    .line 5
    invoke-static {p2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-static {v1}, Le/b/a/d;->d(Landroid/content/Context;)Le/b/a/u;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Le/b/a/u;->d()Le/b/a/s;

    move-result-object v1

    .line 8
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v1, p2}, Le/b/a/s;->a(Landroid/net/Uri;)Le/b/a/s;

    move-result-object p2

    const/16 v1, 0x200

    .line 9
    invoke-virtual {p2, v1, v1}, Le/b/a/s;->c(II)Le/b/a/c0/c;

    move-result-object p2

    .line 10
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Bitmap;

    .line 11
    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "PackIdWidgetItemFactory"

    const-string v0, "Error when loading badgeWidgetLogo"

    .line 12
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    const-string p2, "connection"

    .line 13
    :cond_2
    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "drawable"

    invoke-virtual {v1, p2, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_3

    .line 14
    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;I)V
    .locals 2

    const v0, 0x7f0801a1

    const/4 v1, 0x4

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, p3, v0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 17
    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object v0

    invoke-virtual {v0}, Le/h/b/a/m/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p2}, Le/h/b/a/m/d;->j()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 19
    invoke-virtual {p2, p1}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;I",
            "Ljava/util/TimerTask;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 22
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    int-to-long v1, p3

    .line 23
    invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 24
    invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
    .locals 4

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3
    invoke-virtual {p2}, Le/h/b/a/m/d;->k()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object v1

    sget-object v2, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f08005c

    if-nez v1, :cond_1

    invoke-virtual {p2}, Le/h/b/a/m/d;->y()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x7f070060

    .line 4
    invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 5
    invoke-virtual {p2}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ContactLessId"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p2}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ZoneId"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    :goto_0
    const v1, 0x7f070062

    .line 7
    invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    const/4 v1, 0x1

    const-string v3, "StartApplication"

    .line 8
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 9
    :goto_1
    invoke-virtual {p1, v2, v0}, Landroid/widget/RemoteViews;->setOnClickFillInIntent(ILandroid/content/Intent;)V

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->c(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V

    return-void
.end method

.method public final c(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$a;->a:[I

    invoke-virtual {p2}, Le/h/b/a/m/d;->p()Le/h/b/a/m/i;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const v2, 0x7f080144

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const v3, 0x7f080092

    if-eq v0, v1, :cond_1

    const/4 p2, 0x3

    const v1, 0x7f0801a1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x4

    .line 2
    invoke-virtual {p1, v2, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 3
    invoke-virtual {p1, v3, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 4
    invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, p1, p2, v3}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;I)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p0, p1, p2, v2}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;I)V

    :goto_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getLoadingView()Landroid/widget/RemoteViews;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public getViewAt(I)Landroid/widget/RemoteViews;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0b0027

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    .line 2
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/b/a/m/d;

    .line 3
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Le/h/b/a/m/d;->b()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f08005e

    invoke-virtual {v0, v2, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    invoke-virtual {p0, v0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->b(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V

    .line 5
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    invoke-virtual {p0, v0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Landroid/widget/RemoteViews;Le/h/b/a/m/d;)V

    .line 6
    iget-object p1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->d:Landroid/widget/RemoteViews;

    return-object p1
.end method

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onCreate()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->e:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->f:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public onDataSetChanged()V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    sget-object v0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 3
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 5
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 6
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
