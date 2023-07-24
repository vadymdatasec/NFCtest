.class public Le/f/e/o/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/o/b;

.field public final b:[Le/f/e/l;


# direct methods
.method public constructor <init>(Le/f/e/o/b;[Le/f/e/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/e/o/g;->a:Le/f/e/o/b;

    .line 3
    iput-object p2, p0, Le/f/e/o/g;->b:[Le/f/e/l;

    return-void
.end method


# virtual methods
.method public final a()Le/f/e/o/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/o/g;->a:Le/f/e/o/b;

    return-object v0
.end method

.method public final b()[Le/f/e/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/o/g;->b:[Le/f/e/l;

    return-object v0
.end method
