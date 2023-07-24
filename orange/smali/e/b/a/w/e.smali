.class public final Le/b/a/w/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Ljava/io/File;

.field public final synthetic b:Le/b/a/w/f;


# direct methods
.method public constructor <init>(Le/b/a/w/f;Ljava/lang/String;J[Ljava/io/File;[J)V
    .locals 0

    .line 2
    iput-object p1, p0, Le/b/a/w/e;->b:Le/b/a/w/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p5, p0, Le/b/a/w/e;->a:[Ljava/io/File;

    return-void
.end method

.method public synthetic constructor <init>(Le/b/a/w/f;Ljava/lang/String;J[Ljava/io/File;[JLe/b/a/w/a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Le/b/a/w/e;-><init>(Le/b/a/w/f;Ljava/lang/String;J[Ljava/io/File;[J)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/w/e;->a:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method
