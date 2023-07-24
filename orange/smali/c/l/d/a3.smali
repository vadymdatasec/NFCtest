.class public Lc/l/d/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/d3;

.field public final synthetic c:Lc/l/d/i3;


# direct methods
.method public constructor <init>(Lc/l/d/i3;Lc/l/d/d3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/a3;->c:Lc/l/d/i3;

    iput-object p2, p0, Lc/l/d/a3;->b:Lc/l/d/d3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/a3;->c:Lc/l/d/i3;

    iget-object v0, v0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lc/l/d/a3;->b:Lc/l/d/d3;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/a3;->b:Lc/l/d/d3;

    invoke-virtual {v0}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/a3;->b:Lc/l/d/d3;

    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Lc/l/d/g3;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
