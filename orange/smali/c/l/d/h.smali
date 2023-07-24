.class public Lc/l/d/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/i;


# direct methods
.method public constructor <init>(Lc/l/d/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/h;->b:Lc/l/d/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/h;->b:Lc/l/d/i;

    iget-object v1, v0, Lc/l/d/i;->a:Landroid/view/ViewGroup;

    iget-object v0, v0, Lc/l/d/i;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lc/l/d/h;->b:Lc/l/d/i;

    iget-object v0, v0, Lc/l/d/i;->c:Lc/l/d/o;

    invoke-virtual {v0}, Lc/l/d/p;->a()V

    return-void
.end method
