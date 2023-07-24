.class public Lc/h/n/q1;
.super Lc/h/n/p1;
.source "SourceFile"


# static fields
.field public static final q:Lc/h/n/u1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;)Lc/h/n/u1;

    move-result-object v0

    sput-object v0, Lc/h/n/q1;->q:Lc/h/n/u1;

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/h/n/p1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;Lc/h/n/q1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lc/h/n/p1;-><init>(Lc/h/n/u1;Lc/h/n/p1;)V

    return-void
.end method


# virtual methods
.method public a(I)Lc/h/g/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 2
    invoke-static {p1}, Lc/h/n/t1;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lc/h/g/b;->a(Landroid/graphics/Insets;)Lc/h/g/b;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method
