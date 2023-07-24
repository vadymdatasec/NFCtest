.class public Lc/b/k/j0;
.super Lc/b/k/i0;
.source "SourceFile"


# instance fields
.field public final c:Lc/b/k/a1;

.field public final synthetic d:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;Lc/b/k/a1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/j0;->d:Lc/b/k/n0;

    invoke-direct {p0, p1}, Lc/b/k/i0;-><init>(Lc/b/k/n0;)V

    .line 2
    iput-object p2, p0, Lc/b/k/j0;->c:Lc/b/k/a1;

    return-void
.end method


# virtual methods
.method public b()Landroid/content/IntentFilter;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/j0;->c:Lc/b/k/a1;

    invoke-virtual {v0}, Lc/b/k/a1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/j0;->d:Lc/b/k/n0;

    invoke-virtual {v0}, Lc/b/k/n0;->k()Z

    return-void
.end method
