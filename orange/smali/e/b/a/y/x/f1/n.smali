.class public final Le/b/a/y/x/f1/n;
.super Le/b/a/y/x/f1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/y/x/f1/f<",
        "Le/b/a/y/x/f1/m;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/y/x/f1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/f1/m;
    .locals 1

    .line 4
    new-instance v0, Le/b/a/y/x/f1/m;

    invoke-direct {v0, p0}, Le/b/a/y/x/f1/m;-><init>(Le/b/a/y/x/f1/n;)V

    return-object v0
.end method

.method public a(ILjava/lang/Class;)Le/b/a/y/x/f1/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Le/b/a/y/x/f1/m;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/b/a/y/x/f1/f;->b()Le/b/a/y/x/f1/t;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/f1/m;

    .line 3
    invoke-virtual {v0, p1, p2}, Le/b/a/y/x/f1/m;->a(ILjava/lang/Class;)V

    return-object v0
.end method

.method public bridge synthetic a()Le/b/a/y/x/f1/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/f1/n;->a()Le/b/a/y/x/f1/m;

    move-result-object v0

    return-object v0
.end method
