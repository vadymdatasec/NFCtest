.class public Le/c/a/p1;
.super Le/c/a/u1;
.source "SourceFile"

# interfaces
.implements Le/c/a/r1;


# instance fields
.field public r:Le/c/a/v1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/u1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/c/a/v1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/c/a/p1;->r:Le/c/a/v1;

    return-void
.end method

.method public d()Le/c/a/v1;
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/p1;->r:Le/c/a/v1;

    return-object v0
.end method
