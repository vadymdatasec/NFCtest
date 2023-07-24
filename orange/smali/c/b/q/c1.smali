.class public Lc/b/q/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/q/d1;


# direct methods
.method public constructor <init>(Lc/b/q/d1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/c1;->b:Lc/b/q/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/c1;->b:Lc/b/q/d1;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/b/q/d1;->o:Lc/b/q/c1;

    .line 2
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/c1;->b:Lc/b/q/d1;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/c1;->b:Lc/b/q/d1;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/b/q/d1;->o:Lc/b/q/c1;

    .line 2
    invoke-virtual {v0}, Lc/b/q/d1;->drawableStateChanged()V

    return-void
.end method
