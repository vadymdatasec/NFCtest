.class public Lc/b/p/l;
.super Lc/h/n/e1;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lc/b/p/m;


# direct methods
.method public constructor <init>(Lc/b/p/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/p/l;->c:Lc/b/p/m;

    invoke-direct {p0}, Lc/h/n/e1;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/b/p/l;->a:Z

    .line 3
    iput p1, p0, Lc/b/p/l;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lc/b/p/l;->b:I

    .line 2
    iput-boolean v0, p0, Lc/b/p/l;->a:Z

    .line 3
    iget-object v0, p0, Lc/b/p/l;->c:Lc/b/p/m;

    invoke-virtual {v0}, Lc/b/p/m;->b()V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .line 4
    iget p1, p0, Lc/b/p/l;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc/b/p/l;->b:I

    iget-object v0, p0, Lc/b/p/l;->c:Lc/b/p/m;

    iget-object v0, v0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lc/b/p/l;->c:Lc/b/p/m;

    iget-object p1, p1, Lc/b/p/m;->d:Lc/h/n/d1;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, v0}, Lc/h/n/d1;->a(Landroid/view/View;)V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lc/b/p/l;->a()V

    :cond_1
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lc/b/p/l;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/b/p/l;->a:Z

    .line 3
    iget-object p1, p0, Lc/b/p/l;->c:Lc/b/p/m;

    iget-object p1, p1, Lc/b/p/m;->d:Lc/h/n/d1;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, Lc/h/n/d1;->b(Landroid/view/View;)V

    :cond_1
    return-void
.end method
