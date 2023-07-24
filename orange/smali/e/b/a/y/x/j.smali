.class public Le/b/a/y/x/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/g1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/g1/b;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/d<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/r;


# direct methods
.method public constructor <init>(Le/b/a/y/d;Ljava/lang/Object;Le/b/a/y/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/d<",
            "TDataType;>;TDataType;",
            "Le/b/a/y/r;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/x/j;->a:Le/b/a/y/d;

    .line 3
    iput-object p2, p0, Le/b/a/y/x/j;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Le/b/a/y/x/j;->c:Le/b/a/y/r;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/y/x/j;->a:Le/b/a/y/d;

    iget-object v1, p0, Le/b/a/y/x/j;->b:Ljava/lang/Object;

    iget-object v2, p0, Le/b/a/y/x/j;->c:Le/b/a/y/r;

    invoke-interface {v0, v1, p1, v2}, Le/b/a/y/d;->a(Ljava/lang/Object;Ljava/io/File;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
