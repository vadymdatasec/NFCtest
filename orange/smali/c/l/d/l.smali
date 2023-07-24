.class public Lc/l/d/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/x2;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lc/l/d/r;Lc/l/d/x2;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/l;->b:Lc/l/d/x2;

    iput-object p3, p0, Lc/l/d/l;->c:Landroid/view/View;

    iput-object p4, p0, Lc/l/d/l;->d:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/l;->b:Lc/l/d/x2;

    iget-object v1, p0, Lc/l/d/l;->c:Landroid/view/View;

    iget-object v2, p0, Lc/l/d/l;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Lc/l/d/x2;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
