.class public final Le/f/e/r/r/g/e/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/r/r/g/e/p;

.field public final b:Z


# direct methods
.method public constructor <init>(Le/f/e/r/r/g/e/p;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p2, p0, Le/f/e/r/r/g/e/l;->b:Z

    .line 4
    iput-object p1, p0, Le/f/e/r/r/g/e/l;->a:Le/f/e/r/r/g/e/p;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Le/f/e/r/r/g/e/l;-><init>(Le/f/e/r/r/g/e/p;Z)V

    return-void
.end method


# virtual methods
.method public a()Le/f/e/r/r/g/e/p;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/r/r/g/e/l;->a:Le/f/e/r/r/g/e/p;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/e/r/r/g/e/l;->b:Z

    return v0
.end method
