.class public Lc/b/k/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/q/e1$a;


# instance fields
.field public final synthetic a:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/x;->a:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/x;->a:Lc/b/k/n0;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0, v1}, Lc/b/k/n0;->l(I)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    return-void
.end method
