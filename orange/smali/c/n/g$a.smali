.class public final enum Lc/n/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/n/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/n/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic $VALUES:[Lc/n/g$a;

.field public static final enum ON_ANY:Lc/n/g$a;

.field public static final enum ON_CREATE:Lc/n/g$a;

.field public static final enum ON_DESTROY:Lc/n/g$a;

.field public static final enum ON_PAUSE:Lc/n/g$a;

.field public static final enum ON_RESUME:Lc/n/g$a;

.field public static final enum ON_START:Lc/n/g$a;

.field public static final enum ON_STOP:Lc/n/g$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lc/n/g$a;

    const/4 v1, 0x0

    const-string v2, "ON_CREATE"

    invoke-direct {v0, v2, v1}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_CREATE:Lc/n/g$a;

    .line 2
    new-instance v0, Lc/n/g$a;

    const/4 v2, 0x1

    const-string v3, "ON_START"

    invoke-direct {v0, v3, v2}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_START:Lc/n/g$a;

    .line 3
    new-instance v0, Lc/n/g$a;

    const/4 v3, 0x2

    const-string v4, "ON_RESUME"

    invoke-direct {v0, v4, v3}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_RESUME:Lc/n/g$a;

    .line 4
    new-instance v0, Lc/n/g$a;

    const/4 v4, 0x3

    const-string v5, "ON_PAUSE"

    invoke-direct {v0, v5, v4}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_PAUSE:Lc/n/g$a;

    .line 5
    new-instance v0, Lc/n/g$a;

    const/4 v5, 0x4

    const-string v6, "ON_STOP"

    invoke-direct {v0, v6, v5}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    .line 6
    new-instance v0, Lc/n/g$a;

    const/4 v6, 0x5

    const-string v7, "ON_DESTROY"

    invoke-direct {v0, v7, v6}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    .line 7
    new-instance v0, Lc/n/g$a;

    const/4 v7, 0x6

    const-string v8, "ON_ANY"

    invoke-direct {v0, v8, v7}, Lc/n/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$a;->ON_ANY:Lc/n/g$a;

    const/4 v8, 0x7

    new-array v8, v8, [Lc/n/g$a;

    .line 8
    sget-object v9, Lc/n/g$a;->ON_CREATE:Lc/n/g$a;

    aput-object v9, v8, v1

    sget-object v1, Lc/n/g$a;->ON_START:Lc/n/g$a;

    aput-object v1, v8, v2

    sget-object v1, Lc/n/g$a;->ON_RESUME:Lc/n/g$a;

    aput-object v1, v8, v3

    sget-object v1, Lc/n/g$a;->ON_PAUSE:Lc/n/g$a;

    aput-object v1, v8, v4

    sget-object v1, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    aput-object v1, v8, v5

    sget-object v1, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    aput-object v1, v8, v6

    aput-object v0, v8, v7

    sput-object v8, Lc/n/g$a;->$VALUES:[Lc/n/g$a;

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

.method public static a(Lc/n/g$b;)Lc/n/g$a;
    .locals 1

    .line 1
    sget-object v0, Lc/n/f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Lc/n/g$a;->ON_PAUSE:Lc/n/g$a;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    return-object p0
.end method

.method public static b(Lc/n/g$b;)Lc/n/g$a;
    .locals 1

    .line 1
    sget-object v0, Lc/n/f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Lc/n/g$a;->ON_CREATE:Lc/n/g$a;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Lc/n/g$a;->ON_RESUME:Lc/n/g$a;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lc/n/g$a;->ON_START:Lc/n/g$a;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lc/n/g$a;
    .locals 1

    .line 1
    const-class v0, Lc/n/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/n/g$a;

    return-object p0
.end method

.method public static values()[Lc/n/g$a;
    .locals 1

    .line 1
    sget-object v0, Lc/n/g$a;->$VALUES:[Lc/n/g$a;

    invoke-virtual {v0}, [Lc/n/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/n/g$a;

    return-object v0
.end method


# virtual methods
.method public a()Lc/n/g$b;
    .locals 3

    .line 5
    sget-object v0, Lc/n/f;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no target state"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :pswitch_0
    sget-object v0, Lc/n/g$b;->b:Lc/n/g$b;

    return-object v0

    .line 8
    :pswitch_1
    sget-object v0, Lc/n/g$b;->f:Lc/n/g$b;

    return-object v0

    .line 9
    :pswitch_2
    sget-object v0, Lc/n/g$b;->e:Lc/n/g$b;

    return-object v0

    .line 10
    :pswitch_3
    sget-object v0, Lc/n/g$b;->d:Lc/n/g$b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
