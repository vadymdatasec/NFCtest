.class public Lc/l/d/e0;
.super Lc/l/d/r0;
.source "SourceFile"

# interfaces
.implements Lc/n/y;
.implements Lc/a/i;
.implements Lc/a/k/h;
.implements Lc/l/d/u1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/l/d/r0<",
        "Lc/l/d/f0;",
        ">;",
        "Lc/n/y;",
        "Lc/a/i;",
        "Lc/a/k/h;",
        "Lc/l/d/u1;"
    }
.end annotation


# instance fields
.field public final synthetic f:Lc/l/d/f0;


# direct methods
.method public constructor <init>(Lc/l/d/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    .line 2
    invoke-direct {p0, p1}, Lc/l/d/r0;-><init>(Lc/l/d/f0;)V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    .line 4
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 3
    iget-object p1, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {p1, p2}, Lc/l/d/f0;->a(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/f0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 5
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a(Landroidx/fragment/app/Fragment;)Z
    .locals 0

    .line 2
    iget-object p1, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->b()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public d()Lc/a/k/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->d()Lc/a/k/f;

    move-result-object v0

    return-object v0
.end method

.method public f()Lc/n/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->f()Lc/n/x;

    move-result-object v0

    return-object v0
.end method

.method public g()Lc/n/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    iget-object v0, v0, Lc/l/d/f0;->k:Lc/n/l;

    return-object v0
.end method

.method public j()Lc/l/d/f0;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    return-object v0
.end method

.method public bridge synthetic j()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/l/d/e0;->j()Lc/l/d/f0;

    move-result-object v0

    return-object v0
.end method

.method public k()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/e0;->f:Lc/l/d/f0;

    invoke-virtual {v0}, Lc/l/d/f0;->n()V

    return-void
.end method
