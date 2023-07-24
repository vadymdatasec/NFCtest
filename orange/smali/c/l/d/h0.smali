.class public Lc/l/d/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/i0;


# direct methods
.method public constructor <init>(Lc/l/d/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/h0;->b:Lc/l/d/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/h0;->b:Lc/l/d/i0;

    iget-object v0, v0, Lc/l/d/i0;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/h0;->b:Lc/l/d/i0;

    iget-object v0, v0, Lc/l/d/i0;->b:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lc/l/d/h0;->b:Lc/l/d/i0;

    iget-object v1, v0, Lc/l/d/i0;->c:Lc/l/d/l2;

    iget-object v2, v0, Lc/l/d/i0;->b:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Lc/l/d/i0;->d:Lc/h/j/c;

    invoke-interface {v1, v2, v0}, Lc/l/d/l2;->a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    :cond_0
    return-void
.end method
