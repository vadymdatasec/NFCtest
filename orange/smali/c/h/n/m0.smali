.class public Lc/h/n/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public a:Lc/h/n/u1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lc/h/n/x;


# direct methods
.method public constructor <init>(Landroid/view/View;Lc/h/n/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/n/m0;->b:Landroid/view/View;

    iput-object p2, p0, Lc/h/n/m0;->c:Lc/h/n/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/h/n/m0;->a:Lc/h/n/u1;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 3

    .line 1
    invoke-static {p2, p1}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;Landroid/view/View;)Lc/h/n/u1;

    move-result-object v0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lc/h/n/m0;->b:Landroid/view/View;

    invoke-static {p2, v1}, Lc/h/n/n0;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 4
    iget-object p2, p0, Lc/h/n/m0;->a:Lc/h/n/u1;

    invoke-virtual {v0, p2}, Lc/h/n/u1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lc/h/n/m0;->c:Lc/h/n/x;

    invoke-interface {p2, p1, v0}, Lc/h/n/x;->a(Landroid/view/View;Lc/h/n/u1;)Lc/h/n/u1;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    iput-object v0, p0, Lc/h/n/m0;->a:Lc/h/n/u1;

    .line 8
    iget-object p2, p0, Lc/h/n/m0;->c:Lc/h/n/x;

    invoke-interface {p2, p1, v0}, Lc/h/n/x;->a(Landroid/view/View;Lc/h/n/u1;)Lc/h/n/u1;

    move-result-object p2

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v2, :cond_1

    .line 10
    invoke-virtual {p2}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    invoke-static {p1}, Lc/h/n/v0;->I(Landroid/view/View;)V

    .line 12
    invoke-virtual {p2}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
