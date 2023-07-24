.class public Le/b/a/y/y/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final b:[B

.field public final c:Le/b/a/y/y/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/g<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([BLe/b/a/y/y/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Le/b/a/y/y/g<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/h;->b:[B

    .line 3
    iput-object p2, p0, Le/b/a/y/y/h;->c:Le/b/a/y/y/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/b/a/y/y/h;->c:Le/b/a/y/y/g;

    invoke-interface {v0}, Le/b/a/y/y/g;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-TData;>;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Le/b/a/y/y/h;->c:Le/b/a/y/y/g;

    iget-object v0, p0, Le/b/a/y/y/h;->b:[B

    invoke-interface {p1, v0}, Le/b/a/y/y/g;->a([B)Ljava/lang/Object;

    move-result-object p1

    .line 2
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()Le/b/a/y/a;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/a;->b:Le/b/a/y/a;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method
