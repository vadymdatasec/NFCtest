.class public Lc/a/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/a/a;


# instance fields
.field public final a:Lc/a/g;

.field public final synthetic b:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lc/a/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/h;->b:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/a/h;->a:Lc/a/g;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/h;->b:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v0, v0, Landroidx/activity/OnBackPressedDispatcher;->b:Ljava/util/ArrayDeque;

    iget-object v1, p0, Lc/a/h;->a:Lc/a/g;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lc/a/h;->a:Lc/a/g;

    invoke-virtual {v0, p0}, Lc/a/g;->b(Lc/a/a;)V

    return-void
.end method
