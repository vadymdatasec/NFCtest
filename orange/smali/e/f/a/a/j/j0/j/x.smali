.class public final Le/f/a/a/j/j0/j/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/j0/j/w;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/j/x;->a:Lh/a/a;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/j/x;->b:Lh/a/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/j0/j/x;->c:Lh/a/a;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/j0/j/x;->d:Lh/a/a;

    return-void
.end method

.method public static a(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)Le/f/a/a/j/j0/j/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/y;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/k0/b;",
            ">;)",
            "Le/f/a/a/j/j0/j/x;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/j/j0/j/x;

    invoke-direct {v0, p0, p1, p2, p3}, Le/f/a/a/j/j0/j/x;-><init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V

    return-object v0
.end method


# virtual methods
.method public get()Le/f/a/a/j/j0/j/w;
    .locals 5

    .line 2
    new-instance v0, Le/f/a/a/j/j0/j/w;

    iget-object v1, p0, Le/f/a/a/j/j0/j/x;->a:Lh/a/a;

    invoke-interface {v1}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/a/j/j0/j/x;->b:Lh/a/a;

    invoke-interface {v2}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/a/j/j0/k/e;

    iget-object v3, p0, Le/f/a/a/j/j0/j/x;->c:Lh/a/a;

    invoke-interface {v3}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f/a/a/j/j0/j/y;

    iget-object v4, p0, Le/f/a/a/j/j0/j/x;->d:Lh/a/a;

    invoke-interface {v4}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/f/a/a/j/k0/b;

    invoke-direct {v0, v1, v2, v3, v4}, Le/f/a/a/j/j0/j/w;-><init>(Ljava/util/concurrent/Executor;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/y;Le/f/a/a/j/k0/b;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/j0/j/x;->get()Le/f/a/a/j/j0/j/w;

    move-result-object v0

    return-object v0
.end method