.class public final Le/f/a/d/a/b/v;
.super Le/f/a/d/a/f/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/d/a/f/c<",
        "Le/f/a/d/a/b/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Le/f/a/d/a/b/l1;

.field public final h:Le/f/a/d/a/b/u0;

.field public final i:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Le/f/a/d/a/b/l0;

.field public final k:Le/f/a/d/a/b/x0;

.field public final l:Le/f/a/d/a/c/a;

.field public final m:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/a/d/a/b/l1;Le/f/a/d/a/b/u0;Le/f/a/d/a/e/x;Le/f/a/d/a/b/x0;Le/f/a/d/a/b/l0;Le/f/a/d/a/c/a;Le/f/a/d/a/e/x;Le/f/a/d/a/e/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/f/a/d/a/b/l1;",
            "Le/f/a/d/a/b/u0;",
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;",
            "Le/f/a/d/a/b/x0;",
            "Le/f/a/d/a/b/l0;",
            "Le/f/a/d/a/c/a;",
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "AssetPackServiceListenerRegistry"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1, p1}, Le/f/a/d/a/f/c;-><init>(Le/f/a/d/a/e/a;Landroid/content/IntentFilter;Landroid/content/Context;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Le/f/a/d/a/b/v;->o:Landroid/os/Handler;

    iput-object p2, p0, Le/f/a/d/a/b/v;->g:Le/f/a/d/a/b/l1;

    iput-object p3, p0, Le/f/a/d/a/b/v;->h:Le/f/a/d/a/b/u0;

    iput-object p4, p0, Le/f/a/d/a/b/v;->i:Le/f/a/d/a/e/x;

    iput-object p5, p0, Le/f/a/d/a/b/v;->k:Le/f/a/d/a/b/x0;

    iput-object p6, p0, Le/f/a/d/a/b/v;->j:Le/f/a/d/a/b/l0;

    iput-object p7, p0, Le/f/a/d/a/b/v;->l:Le/f/a/d/a/c/a;

    iput-object p8, p0, Le/f/a/d/a/b/v;->m:Le/f/a/d/a/e/x;

    iput-object p9, p0, Le/f/a/d/a/b/v;->n:Le/f/a/d/a/e/x;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string p1, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    const-string v1, "pack_names"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.play.core.FLAGS"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v2, p0, Le/f/a/d/a/b/v;->l:Le/f/a/d/a/c/a;

    invoke-virtual {v2, p2}, Le/f/a/d/a/c/a;->a(Landroid/os/Bundle;)V

    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v1, p0, Le/f/a/d/a/b/v;->k:Le/f/a/d/a/b/x0;

    sget-object v2, Le/f/a/d/a/b/x;->a:Le/f/a/d/a/b/y;

    invoke-static {p1, p2, v1, v2}, Le/f/a/d/a/b/b;->a(Landroid/os/Bundle;Ljava/lang/String;Le/f/a/d/a/b/x0;Le/f/a/d/a/b/y;)Le/f/a/d/a/b/b;

    move-result-object p2

    iget-object v1, p0, Le/f/a/d/a/f/c;->a:Le/f/a/d/a/e/a;

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p2, v2, v0

    const-string v0, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    invoke-virtual {v1, v0, v2}, Le/f/a/d/a/e/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "confirmation_intent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    if-eqz v0, :cond_2

    iget-object v1, p0, Le/f/a/d/a/b/v;->j:Le/f/a/d/a/b/l0;

    invoke-virtual {v1, v0}, Le/f/a/d/a/b/l0;->a(Landroid/app/PendingIntent;)V

    :cond_2
    iget-object v0, p0, Le/f/a/d/a/b/v;->n:Le/f/a/d/a/e/x;

    invoke-interface {v0}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/a/d/a/b/t;

    invoke-direct {v1, p0, p1, p2}, Le/f/a/d/a/b/t;-><init>(Le/f/a/d/a/b/v;Landroid/os/Bundle;Le/f/a/d/a/b/b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p2, p0, Le/f/a/d/a/b/v;->m:Le/f/a/d/a/e/x;

    invoke-interface {p2}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Executor;

    new-instance v0, Le/f/a/d/a/b/u;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/u;-><init>(Le/f/a/d/a/b/v;Landroid/os/Bundle;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Le/f/a/d/a/f/c;->a:Le/f/a/d/a/e/a;

    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "Corrupt bundle received from broadcast."

    invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Le/f/a/d/a/f/c;->a:Le/f/a/d/a/e/a;

    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "Empty bundle received from broadcast."

    invoke-virtual {p1, v0, p2}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/v;->g:Le/f/a/d/a/b/l1;

    invoke-virtual {v0, p1}, Le/f/a/d/a/b/l1;->a(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/f/a/d/a/b/v;->h:Le/f/a/d/a/b/u0;

    invoke-virtual {p1}, Le/f/a/d/a/b/u0;->a()V

    :cond_0
    return-void
.end method

.method public final synthetic a(Landroid/os/Bundle;Le/f/a/d/a/b/b;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/v;->g:Le/f/a/d/a/b/l1;

    invoke-virtual {v0, p1}, Le/f/a/d/a/b/l1;->b(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Le/f/a/d/a/b/v;->a(Le/f/a/d/a/b/b;)V

    iget-object p1, p0, Le/f/a/d/a/b/v;->i:Le/f/a/d/a/e/x;

    invoke-interface {p1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/d/a/b/j3;

    invoke-interface {p1}, Le/f/a/d/a/b/j3;->a()V

    :cond_0
    return-void
.end method

.method public final a(Le/f/a/d/a/b/b;)V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/v;->o:Landroid/os/Handler;

    new-instance v1, Le/f/a/d/a/b/s;

    invoke-direct {v1, p0, p1}, Le/f/a/d/a/b/s;-><init>(Le/f/a/d/a/b/v;Le/f/a/d/a/b/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
