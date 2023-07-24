.class public final synthetic Le/f/a/d/a/b/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/i/c;


# instance fields
.field public final a:Le/f/a/d/a/b/b0;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/t2;->a:Le/f/a/d/a/b/b0;

    return-void
.end method

.method public static a(Le/f/a/d/a/b/b0;)Le/f/a/d/a/i/c;
    .locals 1

    new-instance v0, Le/f/a/d/a/b/t2;

    invoke-direct {v0, p0}, Le/f/a/d/a/b/t2;-><init>(Le/f/a/d/a/b/b0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/t2;->a:Le/f/a/d/a/b/b0;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Le/f/a/d/a/b/b0;->a(Ljava/util/List;)V

    return-void
.end method
