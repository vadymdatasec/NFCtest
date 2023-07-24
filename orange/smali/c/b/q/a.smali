.class public Lc/b/q/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/n/d1;


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lc/b/q/b;


# direct methods
.method public constructor <init>(Lc/b/q/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/a;->c:Lc/b/q/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/b/q/a;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lc/h/n/c1;I)Lc/b/q/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/a;->c:Lc/b/q/b;

    iput-object p1, v0, Lc/b/q/b;->g:Lc/h/n/c1;

    .line 2
    iput p2, p0, Lc/b/q/a;->b:I

    return-object p0
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .line 3
    iget-boolean p1, p0, Lc/b/q/a;->a:Z

    if-eqz p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lc/b/q/a;->c:Lc/b/q/b;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/b/q/b;->g:Lc/h/n/c1;

    .line 5
    iget v0, p0, Lc/b/q/a;->b:I

    invoke-static {p1, v0}, Lc/b/q/b;->b(Lc/b/q/b;I)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/b/q/a;->c:Lc/b/q/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/b/q/b;->a(Lc/b/q/b;I)V

    .line 2
    iput-boolean v0, p0, Lc/b/q/a;->a:Z

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lc/b/q/a;->a:Z

    return-void
.end method
