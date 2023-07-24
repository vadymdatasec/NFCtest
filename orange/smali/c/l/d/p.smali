.class public abstract Lc/l/d/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/l/d/h3;

.field public final b:Lc/h/j/c;


# direct methods
.method public constructor <init>(Lc/l/d/h3;Lc/h/j/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/l/d/p;->a:Lc/l/d/h3;

    .line 3
    iput-object p2, p0, Lc/l/d/p;->b:Lc/h/j/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/p;->a:Lc/l/d/h3;

    iget-object v1, p0, Lc/l/d/p;->b:Lc/h/j/c;

    invoke-virtual {v0, v1}, Lc/l/d/h3;->a(Lc/h/j/c;)V

    return-void
.end method

.method public b()Lc/l/d/h3;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p;->a:Lc/l/d/h3;

    return-object v0
.end method

.method public c()Lc/h/j/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p;->b:Lc/h/j/c;

    return-object v0
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/p;->a:Lc/l/d/h3;

    .line 2
    invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 3
    invoke-static {v0}, Lc/l/d/g3;->b(Landroid/view/View;)Lc/l/d/g3;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lc/l/d/p;->a:Lc/l/d/h3;

    invoke-virtual {v1}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 5
    sget-object v2, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
