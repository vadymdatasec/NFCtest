.class public Lc/l/d/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/s/c;
.implements Lc/n/y;


# instance fields
.field public final b:Lc/n/x;

.field public c:Lc/n/l;

.field public d:Lc/s/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lc/n/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/l/d/y2;->c:Lc/n/l;

    .line 3
    iput-object p1, p0, Lc/l/d/y2;->d:Lc/s/b;

    .line 4
    iput-object p2, p0, Lc/l/d/y2;->b:Lc/n/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/n/l;

    invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V

    iput-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    .line 3
    invoke-static {p0}, Lc/s/b;->a(Lc/s/c;)Lc/s/b;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/y2;->d:Lc/s/b;

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lc/l/d/y2;->d:Lc/s/b;

    invoke-virtual {v0, p1}, Lc/s/b;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lc/n/g$a;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    invoke-virtual {v0, p1}, Lc/n/l;->a(Lc/n/g$a;)V

    return-void
.end method

.method public a(Lc/n/g$b;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    invoke-virtual {v0, p1}, Lc/n/l;->d(Lc/n/g$b;)V

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/y2;->d:Lc/s/b;

    invoke-virtual {v0, p1}, Lc/s/b;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public c()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/l/d/y2;->a()V

    .line 2
    iget-object v0, p0, Lc/l/d/y2;->d:Lc/s/b;

    invoke-virtual {v0}, Lc/s/b;->a()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Lc/n/x;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/l/d/y2;->a()V

    .line 2
    iget-object v0, p0, Lc/l/d/y2;->b:Lc/n/x;

    return-object v0
.end method

.method public g()Lc/n/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/l/d/y2;->a()V

    .line 2
    iget-object v0, p0, Lc/l/d/y2;->c:Lc/n/l;

    return-object v0
.end method
