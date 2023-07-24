.class public final Le/f/a/a/j/j0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/j0/j/m;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/g;->a:Lh/a/a;

    return-void
.end method

.method public static a(Lh/a/a;)Le/f/a/a/j/j0/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;)",
            "Le/f/a/a/j/j0/g;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/j/j0/g;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/g;-><init>(Lh/a/a;)V

    return-object v0
.end method

.method public static a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/m;
    .locals 1

    .line 2
    invoke-static {p0}, Le/f/a/a/j/j0/f;->a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/m;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lf/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Le/f/a/a/j/j0/j/m;

    return-object p0
.end method


# virtual methods
.method public get()Le/f/a/a/j/j0/j/m;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/a/j/j0/g;->a:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/a/j/l0/a;

    invoke-static {v0}, Le/f/a/a/j/j0/g;->a(Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/j0/g;->get()Le/f/a/a/j/j0/j/m;

    move-result-object v0

    return-object v0
.end method
