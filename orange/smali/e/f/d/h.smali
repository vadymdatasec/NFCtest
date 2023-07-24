.class public abstract enum Le/f/d/h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Le/f/d/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/d/h;",
        ">;",
        "Le/f/d/i;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/d/h;

.field public static final enum c:Le/f/d/h;

.field public static final enum d:Le/f/d/h;

.field public static final enum e:Le/f/d/h;

.field public static final enum f:Le/f/d/h;

.field public static final synthetic g:[Le/f/d/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/f/d/c;

    const/4 v1, 0x0

    const-string v2, "IDENTITY"

    invoke-direct {v0, v2, v1}, Le/f/d/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/h;->b:Le/f/d/h;

    .line 2
    new-instance v0, Le/f/d/d;

    const/4 v2, 0x1

    const-string v3, "UPPER_CAMEL_CASE"

    invoke-direct {v0, v3, v2}, Le/f/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/h;->c:Le/f/d/h;

    .line 3
    new-instance v0, Le/f/d/e;

    const/4 v3, 0x2

    const-string v4, "UPPER_CAMEL_CASE_WITH_SPACES"

    invoke-direct {v0, v4, v3}, Le/f/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/h;->d:Le/f/d/h;

    .line 4
    new-instance v0, Le/f/d/f;

    const/4 v4, 0x3

    const-string v5, "LOWER_CASE_WITH_UNDERSCORES"

    invoke-direct {v0, v5, v4}, Le/f/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/h;->e:Le/f/d/h;

    .line 5
    new-instance v0, Le/f/d/g;

    const/4 v5, 0x4

    const-string v6, "LOWER_CASE_WITH_DASHES"

    invoke-direct {v0, v6, v5}, Le/f/d/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/h;->f:Le/f/d/h;

    const/4 v6, 0x5

    new-array v6, v6, [Le/f/d/h;

    .line 6
    sget-object v7, Le/f/d/h;->b:Le/f/d/h;

    aput-object v7, v6, v1

    sget-object v1, Le/f/d/h;->c:Le/f/d/h;

    aput-object v1, v6, v2

    sget-object v1, Le/f/d/h;->d:Le/f/d/h;

    aput-object v1, v6, v3

    sget-object v1, Le/f/d/h;->e:Le/f/d/h;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/f/d/h;->g:[Le/f/d/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILe/f/d/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Le/f/d/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(CLjava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p2, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/d/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Le/f/d/h;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v1, v3, :cond_1

    .line 11
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_0

    .line 14
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_2

    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 16
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-nez v3, :cond_3

    .line 17
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    add-int/lit8 v1, v1, 0x1

    invoke-static {v2, p0, v1}, Le/f/d/h;->a(CLjava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 3
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 4
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/d/h;
    .locals 1

    .line 1
    const-class v0, Le/f/d/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/d/h;

    return-object p0
.end method

.method public static values()[Le/f/d/h;
    .locals 1

    .line 1
    sget-object v0, Le/f/d/h;->g:[Le/f/d/h;

    invoke-virtual {v0}, [Le/f/d/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/d/h;

    return-object v0
.end method
