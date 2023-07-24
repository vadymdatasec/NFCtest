.class public final synthetic Le/f/c/l/e/r/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Le/f/c/l/e/r/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/l/e/r/e;

    invoke-direct {v0}, Le/f/c/l/e/r/e;-><init>()V

    sput-object v0, Le/f/c/l/e/r/e;->b:Le/f/c/l/e/r/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Le/f/c/l/e/r/e;->b:Le/f/c/l/e/r/e;

    return-object v0
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-static {p1, p2}, Le/f/c/l/e/r/g;->b(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    return p1
.end method
